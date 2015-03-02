package com.uttesh.spring.entitymanager.user.impl;

import com.uttesh.spring.entitymanager.dao.IUserDAO;
import com.uttesh.spring.entitymanager.model.User;
import com.uttesh.spring.entitymanager.user.IUserService;
import java.util.List;
import java.lang.UnknownError;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDAO userDAO;

    //@Transactional(readOnly = false)
    public void save(User user) {
        try {
            userDAO.save(user);
            save1();
           // save2();
        } catch (InterruptedException ex) {
            Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void save1() throws InterruptedException {
        User user = new User();
        user.setId(1008);
        user.setName("Uttesh kumar");
        user.setEmail("uttesh@gmail.com");
        user.setMobile("0123456789");
        user.setPassword("password");
        userDAO.save(user);
    }

    public void save2() {
        throw new UnknownError("INVALID");
    }

    @Transactional(readOnly = false)
    public List<User> findAllUsers() {
        return userDAO.findAllUsers();
    }

}
