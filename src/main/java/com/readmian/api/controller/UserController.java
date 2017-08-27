package com.readmian.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuehao on 2017/8/27.
 */
@RestController
public class UserController {


    @RequestMapping("/index")
    public String getString()throws Exception{
        return "岳浩";
    }
}
