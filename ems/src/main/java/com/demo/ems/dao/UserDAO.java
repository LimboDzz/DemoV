package com.demo.ems.dao;

import com.demo.ems.entity.User;

public interface UserDAO {
    void save(User user);

    User findByUsernameAndPassword(String username, String password);
}
