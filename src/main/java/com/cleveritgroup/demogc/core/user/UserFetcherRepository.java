package com.cleveritgroup.demogc.core.user;

import java.util.List;

public interface UserFetcherRepository {
    List<User> findAll();
}
