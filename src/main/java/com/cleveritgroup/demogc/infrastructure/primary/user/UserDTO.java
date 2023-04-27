package com.cleveritgroup.demogc.infrastructure.primary.user;

import com.cleveritgroup.demogc.core.user.User;

public class UserDTO {

    private final String name;
    private final String lastName;
    private final String email;
    private final String password;

    public UserDTO(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }


    public User toDomain(){
        return User.builder()
                .setName(name)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .createUser();
    }

}
