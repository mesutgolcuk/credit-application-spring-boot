package com.mesutgolcuk.creditapplication.model.common;

import com.mesutgolcuk.creditapplication.exception.InvalidInputException;

import java.math.BigInteger;

public class MonthlyIncome {
    private BigInteger monthlyIncome;

    public MonthlyIncome(BigInteger monthlyIncome) throws InvalidInputException {
        if(validate(monthlyIncome)) {
            this.monthlyIncome = monthlyIncome;
        } else {
            throw new InvalidInputException("Invalid monthly income");
        }

    }

    private boolean validate(BigInteger monthlyIncome) {
        // validate
        return true;
    }

    public BigInteger getValue() {
        return monthlyIncome;
    }
}
