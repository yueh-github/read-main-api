package com.readmain.api.controller;

import com.google.gson.Gson;
import com.readmain.common.entity.DemoEntity;
import com.readmain.common.entity.TestUser;
import com.readmain.common.entity.UserEntity;
import com.readmain.service.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by yuehao on 2017/8/27.
 */
@RestController
public class UserController {

    @Resource
    private TestService testService;


    @RequestMapping("/index")
    public String getString() throws Exception {
        UserEntity userEntity = new UserEntity();
        userEntity.setAge(100);
        userEntity.setName("岳浩");
//
        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setMsg("mes:给我一杯水");
        demoEntity.setContent("content:水来了~");
        return new Gson().toJson(demoEntity);
//        return "岳浩";
    }


    @RequestMapping("/list")
    public List<TestUser> getUserList() throws Exception {
        return this.testService.getUserList();
    }
}
