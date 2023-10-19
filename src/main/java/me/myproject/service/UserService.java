package me.myproject.service;

import me.myproject.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
