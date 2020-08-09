package com.mesutgolcuk.creditapplication.model;

import com.mesutgolcuk.creditapplication.model.base.BaseResponse;

import java.math.BigInteger;

public class CreditApplicationResponse extends BaseResponse {
    private boolean isSuitableForCredit;
    private BigInteger creditLimit;

    public boolean isSuitableForCredit() {
        return isSuitableForCredit;
    }

    public void setSuitableForCredit(boolean suitableForCredit) {
        isSuitableForCredit = suitableForCredit;
    }

    public BigInteger getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigInteger creditLimit) {
        this.creditLimit = creditLimit;
    }
}
