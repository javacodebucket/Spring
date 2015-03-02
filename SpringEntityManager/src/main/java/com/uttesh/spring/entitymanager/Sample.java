package com.uttesh.spring.entitymanager;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uttesh.spring.entitymanager.model.User;
import com.uttesh.spring.entitymanager.user.IUserService;

public class Sample {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        IUserService userManager = (IUserService) ctx.getBean("userServiceImpl");

        List<User> list = userManager.findAllUsers();
        System.out.println("User count: " + list.size());

        User user = new User();
        user.setId(1006);
        user.setName("Uttesh kumar");
        user.setEmail("uttesh@gmail.com");
        user.setMobile("0123456789");
        user.setPassword("password");
        userManager.save(user);
        System.out.println("User inserted!");

        list = userManager.findAllUsers();
        System.out.println("User count: " + list.size());

    }
}
