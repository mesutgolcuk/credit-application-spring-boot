package com.mesutgolcuk.creditapplication.model;

import com.mesutgolcuk.creditapplication.exception.InvalidInputException;
import com.mesutgolcuk.creditapplication.model.common.IdentityNo;
import com.mesutgolcuk.creditapplication.model.common.MonthlyIncome;
import com.mesutgolcuk.creditapplication.model.common.Name;
import com.mesutgolcuk.creditapplication.model.common.Phone;

public class CreditApplicationModel {
    private IdentityNo identityNo;
    private Name name;
    private Phone phone;
    private MonthlyIncome monthlyIncome;

    public CreditApplicationModel(CreditApplicationRequest request) throws InvalidInputException {
        identityNo = new IdentityNo(request.getIdentityNo());
        name = new Name(request.getName());
        phone = new Phone(request.getPhone());
        monthlyIncome = new MonthlyIncome(request.getMonthlyIncome());
    }

    public IdentityNo getIdentityNo() {
        return identityNo;
    }

    public Name getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }

    public MonthlyIncome getMonthlyIncome() {
        return monthlyIncome;
    }
}
