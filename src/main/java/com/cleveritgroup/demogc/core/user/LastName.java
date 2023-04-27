package com.cleveritgroup.demogc.core.user;

 record LastName(String value) {


    public LastName {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("LastName cannot be null or blank");
        }
        if (value.matches(".*\\d.*")) {
            throw new IllegalArgumentException("LastName cannot have numbers");
        }
    }
}
