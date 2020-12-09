package com.demo.ems.service;

import java.util.UUID;

import com.demo.ems.dao.UserDAO;
import com.demo.ems.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public void save(User user) {
        // 先设置主键再保存
        user.setId(UUID.randomUUID().toString());
        userDAO.save(user);
    }

    @Override
    public User login(String username, String password) {
        return userDAO.findByUsernameAndPassword(username,password);
    }
    
}
