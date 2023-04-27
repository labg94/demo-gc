package com.cleveritgroup.demogc.core.user;

public class UserBuilder {
    private Name name;
    private LastName lastName;
    private Email email;
    private Password password;

    UserBuilder() {
    }

    public UserBuilder setName(String name) {
        this.name = new Name(name);
        return this;
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = new LastName(lastName);
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = new Email(email);
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = new Password(password);
        return this;
    }

    public User createUser() {
        return new User(name, lastName, email, password);
    }
}
