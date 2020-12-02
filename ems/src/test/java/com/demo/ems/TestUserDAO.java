package com.demo.ems;

import java.util.UUID;

import com.demo.ems.dao.UserDAO;
import com.demo.ems.entity.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
// designate the entry class
@SpringBootTest(classes = EmsApplication.class)
@RunWith(SpringRunner.class)
public class TestUserDAO {
    @Autowired
    private UserDAO userDAO;
    @Test
    public void testSave(){
        userDAO.save(new User("xiaochen","123"));
    }
}
