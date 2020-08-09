package com.mesutgolcuk.creditapplication.service;

import com.mesutgolcuk.creditapplication.model.CreditApplicationModel;
import com.mesutgolcuk.creditapplication.model.CreditApplicationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class CreditApplicationService {

    @Autowired
    CreditScoreService scoreService;

    @Autowired
    ParameterService parameterService;

    public CreditApplicationResponse calculateCreditApplication(CreditApplicationModel application) {
        CreditApplicationResponse response = new CreditApplicationResponse();
        boolean isSuitable = false;
        BigInteger limit = BigInteger.ZERO;
        BigInteger income = application.getMonthlyIncome().getValue();

        long creditScore = scoreService.getCreditScore(application);

        if (isCreditScoreBetweenMinAndMaxAndIncomeLowerThanLimit(creditScore, income)) {
            isSuitable = true;
            limit = parameterService.getDefaultLimit();
        } else if (isCreditScoreHigherThanMaxCreditScore(creditScore)) {
            isSuitable = true;
            limit = income.multiply(BigInteger.valueOf(parameterService.getCreditMultiplier()));
        }
        response.setCreditLimit(limit);
        response.setSuitableForCredit(isSuitable);
        return response;
    }

    private boolean isCreditScoreBetweenMinAndMaxAndIncomeLowerThanLimit(long creditScore, BigInteger income) {
        return  creditScore >= parameterService.getMinCreditScore() &&
                creditScore < parameterService.getMaxCreditScore() &&
                income.compareTo(parameterService.getIncomeLimit()) < 0;
    }

    private boolean isCreditScoreHigherThanMaxCreditScore(long creditScore) {
        return creditScore >= parameterService.getMaxCreditScore();
    }
}
