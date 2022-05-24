package ru.neginskiy.familytime.service;

import ru.neginskiy.familytime.domain.User;

public interface UserService {

    User findByName(String userName);
}
