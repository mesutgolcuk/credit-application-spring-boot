package com.mesutgolcuk.creditapplication.service;

import com.mesutgolcuk.creditapplication.dao.CreditApplicationDao;
import com.mesutgolcuk.creditapplication.model.CreditApplicationEntity;
import com.mesutgolcuk.creditapplication.model.CreditApplicationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {
    @Autowired
    CreditApplicationDao creditApplicationDao;

    public void createCreditApplication(CreditApplicationModel model) {
        CreditApplicationEntity app = new CreditApplicationEntity();
        app.setIdentityNo(model.getIdentityNo().getValue());
        app.setMonthlyIncome(model.getMonthlyIncome().getValue());
        app.setName(model.getName().getValue());
        app.setPhone(model.getPhone().getValue());
        creditApplicationDao.create(app);
    }
}
