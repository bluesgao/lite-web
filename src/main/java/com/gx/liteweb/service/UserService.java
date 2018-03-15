package com.gx.liteweb.service;

import com.gx.liteweb.domain.User;

import java.util.List;

public interface UserService {
    int addUser(User user);

    List<User> qryUser(User user);
}
