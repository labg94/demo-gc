package com.cleveritgroup.demogc.core.user;

record Password(String value) {


    public Password {
        if(value == null || value.isBlank()) {
            throw new IllegalArgumentException("Password cannot be null or blank");
        }

        if(value.length()<8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }

        //check the value has at least one upper case letter, one lower case letter, one number and one special character using regex
        if(!value.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^\\da-zA-Z]).{8,}$")) {
            throw new IllegalArgumentException("Password must have at least one upper case letter, one lower case letter, one number and one special character");
        }
    }

}
