package com.mervin.controller;

import com.mervin.util.PersonProperties;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mervin
 */

@RestController
public class HelloController {

    @Autowired
   private PersonProperties personProperties;

    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String say(HttpServletRequest request){
        return "My name is "+personProperties.getName();
    }
}
