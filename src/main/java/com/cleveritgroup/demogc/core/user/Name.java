package com.cleveritgroup.demogc.core.user;
record Name(String value) {

    public Name {
        if(value == null || value.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }

        if(value.contains(" ")) {
            throw new IllegalArgumentException("Name cannot have spaces");
        }
        if(value.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Name cannot have numbers");
        }

    }
}
