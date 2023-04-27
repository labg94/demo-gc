package com.cleveritgroup.demogc.core.user;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
class UserFetcher implements FetchUserCase {

    private final UserFetcherRepository userRepository;

    public UserFetcher(UserFetcherRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
