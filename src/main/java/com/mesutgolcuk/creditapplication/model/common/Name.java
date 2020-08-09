package com.mesutgolcuk.creditapplication.model.common;

import com.mesutgolcuk.creditapplication.exception.InvalidInputException;

public class Name {
    private String name;

    public Name(String name) throws InvalidInputException {
        if(validate(name)) {
            this.name = name;
        } else {
            throw new InvalidInputException("Invalid name");
        }
    }

    private boolean validate(String name) {
        //validate
        return true;
    }

    public String getValue() {
        return name;
    }
}
