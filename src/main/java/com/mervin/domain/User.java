package com.mervin.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author Mervin
 * @date 2017/7/13 0:31
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Size(min = 2,max = 15,message = "用户名长度在2到15之间！")
    @NotEmpty(message="用户名不能为空")
    @Pattern(regexp = "[a-zA-Z]{1}[a-zA-Z0-9_]{1,14}",message = "用户名必须由字母数字下划线组成且开头必须是字母，不能超过16位！")
    private String name;

    @NotEmpty(message="密码不能为空")
    @Pattern(regexp = "[a-zA-Z0-9]{1,10}",message = "密码只能包含字母和数字！且长度不超过10！")
    private String password;

    @Min(value = 18,message = "未满18岁！！！")
    private Integer age;


    public User() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
