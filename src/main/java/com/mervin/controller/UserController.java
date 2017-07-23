package com.mervin.controller;

import com.mervin.dao.UserRepository;
import com.mervin.domain.User;
import com.mervin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Mervin
 * @Description:
 * @date 2017/7/12 22:54
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    /**
     * 查询所有的用户
     * @return
     */
    @GetMapping(value="/users")
    public List<User> userList(){
        return userRepository.findAll();
    }

    /**
     * 新增用户
     * @param age
     * @param name
     * @param password
     * @return
     */
    @PostMapping(value="/users")
    public User UserAdd(@RequestParam("age") Integer age,
                        @RequestParam("name") String name,
                        @RequestParam("password") String password,User user2){
        User user = new User();
        user.setAge(age);
        user.setName(name);
        user.setPassword(password);
        userRepository.save(user2);
        return userRepository.save(user);
    }

    /**
     * 通过ID查找用户
     * @param id
     * @return
     */
    @GetMapping(value="/users/{id}")
    public User UserFindById(@PathVariable("id") Integer id){
        return userRepository.findOne(id);
    }

    /**
     * 更新用户
     * @param id
     * @param age
     * @param name
     * @return
     */
    @PutMapping(value="/users/{id}")
    public User UserUpdate(@PathVariable("id") Integer id,
                           @RequestParam("age") Integer age,
                           @RequestParam("name") String name,
                           @RequestParam("password") String password ) {
        User user = new User();
        user.setId(id);
        user.setAge(age);
        user.setName(name);
        user.setPassword(password);
        return userRepository.saveAndFlush(user);
    }

    /**
     * 通过ID查找用户
     * @param id
     * @return
     */
    @DeleteMapping(value="/users/{id}")
    public void UserDeleteById(@PathVariable("id") Integer id){
        userRepository.delete(id);
    }

    @PostMapping("/users/trans")
    public String saveTwoUser(){
        userService.saveTwoUser();
        return "成功";
    }
}