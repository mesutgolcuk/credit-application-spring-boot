package com.mesutgolcuk.creditapplication.controller;

import com.mesutgolcuk.creditapplication.exception.InvalidInputException;
import com.mesutgolcuk.creditapplication.model.CreditApplicationModel;
import com.mesutgolcuk.creditapplication.model.CreditApplicationResponse;
import com.mesutgolcuk.creditapplication.model.CreditApplicationRequest;
import com.mesutgolcuk.creditapplication.service.CreditApplicationService;
import com.mesutgolcuk.creditapplication.service.DatabaseService;
import com.mesutgolcuk.creditapplication.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditApplicationController {

    @Autowired
    CreditApplicationService creditApplicationService;

    @Autowired
    SmsService smsService;

    @Autowired
    DatabaseService databaseService;

    @PostMapping("/api/application")
    public ResponseEntity<?> creditApplication(CreditApplicationRequest request) {
        CreditApplicationResponse response = new CreditApplicationResponse();
        try {
            CreditApplicationModel application = new CreditApplicationModel(request);
            response = creditApplicationService.calculateCreditApplication(application);
            databaseService.createCreditApplication(application);
            smsService.sendSms(response, application.getPhone());
        } catch (InvalidInputException e) {
            response.setErrorMessage(e.getMessage());
            response.setErrorCode(-1);
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
