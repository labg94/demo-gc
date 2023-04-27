package com.cleveritgroup.demogc.infrastructure.primary.user;

import com.cleveritgroup.demogc.core.user.FetchUserCase;
import com.cleveritgroup.demogc.core.user.NewUserCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final NewUserCase newUserCase;
    private final FetchUserCase fetchUserCase;


    public UserController(NewUserCase newUserCase, FetchUserCase fetchUserCase) {
        this.newUserCase = newUserCase;
        this.fetchUserCase = fetchUserCase;
    }

    @PostMapping
    public UserResponse save(@RequestBody UserDTO userDTO) {
        return UserResponse.fromDomain(newUserCase.save(userDTO.toDomain()));
    }

    @GetMapping
    public List<UserResponse> findAll() {
        return fetchUserCase.findAll().stream().map(UserResponse::fromDomain).toList();
    }


}
