package com.PhotoShare.backend.service.impl;

import com.PhotoShare.backend.dao.UserDao;
import com.PhotoShare.backend.model.User;
import com.PhotoShare.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Le on 4/27/2016.
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public List<User> findAllUsers() {
        return userDao.findAll();
    }

    public User findByUserName(String userName) {
        return userDao.findByUserName(userName);
    }

    public User save(User user) {
        return userDao.save(user);
    }


}
