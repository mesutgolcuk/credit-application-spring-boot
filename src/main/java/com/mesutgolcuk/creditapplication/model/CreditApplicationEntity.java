package com.mesutgolcuk.creditapplication.model;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table
public class CreditApplicationEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String identityNo;
    @Column
    private String name;
    @Column
    private String phone;
    @Column
    private BigInteger monthlyIncome;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigInteger getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(BigInteger monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
}
