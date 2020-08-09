package com.mesutgolcuk.creditapplication.model;

import com.mesutgolcuk.creditapplication.model.base.BaseRequest;

import java.math.BigInteger;

public class CreditApplicationRequest extends BaseRequest {
    private String identityNo;
    private String name;
    private BigInteger monthlyIncome;
    private String phone;

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(BigInteger monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
