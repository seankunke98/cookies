package com.example.demo.controller;


import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@CrossOrigin
@RestController
public class UserController {

    private UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @RequestMapping(value = "/users/current", method = RequestMethod.GET)
    public User getCurrentUser(Principal principal) {
        return userDao.findByUsername(principal.getName());
    }
}
