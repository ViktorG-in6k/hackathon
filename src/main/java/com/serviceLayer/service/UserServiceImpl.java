package com.serviceLayer.service;

import com.dataLayer.DAO.UserDAO;
import com.dataLayer.entity.User;
import com.dataLayer.entity.external.OauthProfile;
import com.serviceLayer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;

    public void saveUser(User user) {
        if (getUserByEmail(user.getEmail()) == null) {
            userDAO.save(user);
        }
    }

    public void saveUser(String email) {
        if (getUserByEmail(email) == null) {
            userDAO.save(new User(email));
        }
    }

    public User getUser(long id) {
        return userDAO.getUser(id);
    }

    public User getUserByEmail(String email) {
        return userDAO.getUserByEmail(email);
    }

    @Override
    public User getUserFromOauthUser(OauthProfile oauthProfile) {
        User user = new User();
        user.setName(oauthProfile.getName());
        user.setEmail(oauthProfile.getEmail());
        user.setFamilyName(oauthProfile.getFamilyName());
        user.setGender(oauthProfile.getGender());
        user.setPicture(oauthProfile.getPicture());
        return user;
    }
}
