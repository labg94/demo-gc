package com.cleveritgroup.demogc.core.user;

record Email(String value) {

    public Email {
        if(value == null || value.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or blank");
        }

        if(!value.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            throw new IllegalArgumentException("Email is not valid");
        }
    }
}
