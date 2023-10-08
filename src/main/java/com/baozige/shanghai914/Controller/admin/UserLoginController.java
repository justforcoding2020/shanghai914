package com.baozige.shanghai914.Controller.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "用户登录操作")
@RestController
@RequestMapping("userlogin")
public class UserLoginController {
    @ApiOperation("用户登录请求")
    @GetMapping("/{id}")
    public R login(@PathVariable Long id){

    }
}
