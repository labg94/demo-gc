package com.cleveritgroup.demogc.core.user;

public class User {

    private final Name name;
    private final LastName lastName;
    private final Email email;
    private final Password password;

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    User(Name name, LastName lastName, Email email, Password password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }


    public String name() {
        return name.value();
    }

    public String lastName() {
        return lastName.value();
    }

    public String email() {
        return email.value();
    }

    public String password() {
        return password.value();
    }
}
