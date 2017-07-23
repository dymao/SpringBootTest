package com.mervin.service;

import com.mervin.dao.UserRepository;
import com.mervin.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Mervin
 * 2017/7/16 17:27
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void saveTwoUser(){
        User userOne = new User();
        userOne.setName("A");
        userOne.setAge(20);
        userOne.setPassword("aaaaa");

        User userTwo = new User();
        userTwo.setName("BBBBBBB");
        userTwo.setAge(30000);
        userTwo.setPassword("bbbbbb");

        userRepository.save(userOne);
        userRepository.save(userTwo);
    }
}
