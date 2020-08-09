package com.mesutgolcuk.creditapplication.model.common;

import com.mesutgolcuk.creditapplication.exception.InvalidInputException;

public class Phone {
    private String phone;

    public Phone(String phone) throws InvalidInputException {
        if (validate(phone)) {
            this.phone = phone;
        } else {
            throw new InvalidInputException("Invalid phone");
        }
    }

    private boolean validate(String phone) {
        // validate
        return true;
    }

    public String getValue() {
        return phone;
    }
}
