package com.mesutgolcuk.creditapplication.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class ParameterService {
    public long getMinCreditScore() {
        return 500;
    }
    public long getMaxCreditScore() {
        return 1000;
    }
    public BigInteger getIncomeLimit() {
        return BigInteger.valueOf(5000);
    }
    public BigInteger getDefaultLimit() {
        return BigInteger.valueOf(10000);
    }
    public long getCreditMultiplier() {
        return 4;
    }
}
