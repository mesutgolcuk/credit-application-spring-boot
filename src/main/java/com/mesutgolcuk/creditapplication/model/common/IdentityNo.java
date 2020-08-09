package com.mesutgolcuk.creditapplication.model.common;

import com.mesutgolcuk.creditapplication.exception.InvalidInputException;

public class IdentityNo {
    private String identityNo;

    public IdentityNo(String identityNo) throws InvalidInputException {
        if(validate(identityNo)) {
            this.identityNo = identityNo;
        } else {
            throw new InvalidInputException("Invalid identity no");
        }

    }

    private boolean validate(String identityNo) {
        // validate
        return true;
    }

    public String getValue() {
        return identityNo;
    }
}
