package com.cleveritgroup.demogc.core.user;

import org.springframework.stereotype.Service;

@Service
class UserSaver implements NewUserCase {

    private final UserRepository userRepository;

    public UserSaver(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
