package com.demo.ems.service;

import com.demo.ems.entity.User;

public interface UserService {
    public void save(User user);

	public User login(String username, String password);
}
