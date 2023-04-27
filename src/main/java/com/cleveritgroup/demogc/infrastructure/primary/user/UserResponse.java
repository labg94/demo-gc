package com.cleveritgroup.demogc.infrastructure.primary.user;

public record UserResponse(String name, String lastName, String email) {

    public static UserResponse fromDomain(com.cleveritgroup.demogc.core.user.User user) {
        return new UserResponse(user.name(), user.lastName(), user.email());
    }
}
