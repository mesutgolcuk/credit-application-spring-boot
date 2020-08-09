package com.mesutgolcuk.creditapplication.service;

import com.mesutgolcuk.creditapplication.model.CreditApplicationModel;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class CreditScoreService {
    public long getCreditScore(CreditApplicationModel application) {
        //call score service
        return 1500;
    }
}
