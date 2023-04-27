package com.cleveritgroup.demogc.infrastructure.secundary.user;

import com.cleveritgroup.demogc.core.user.User;
import com.cleveritgroup.demogc.core.user.UserFetcherRepository;
import com.cleveritgroup.demogc.core.user.UserRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemoryRepository implements UserRepository, UserFetcherRepository {
    private final List<User> users = new ArrayList<>();


    @Override
    public User save(User user) {
        users.add(user);
        return user;
    }

    @Override
    public List<User> findAll() {
        return users;
    }
}
