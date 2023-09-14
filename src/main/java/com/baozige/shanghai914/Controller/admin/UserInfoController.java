package com.baozige.shanghai914.Controller.admin;


import com.baozige.shanghai914.POJO.UserInfo;
import com.baozige.shanghai914.Service.UserInfoService;
import io.swagger.annotations.Api;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.sun.jmx.remote.util.ClassLogger.ok;

@Data
@Slf4j
@Api("用户信息操作")
@RestController
@RequestMapping("admin")
public class UserInfoController {
    //用户信息增加
    public UserInfo addUserInfo(@RequestBody UserInfo userInfo){
        Assert.notNull(userInfo, "非法输入");
        UserInfoService.insertUserInfo;
        return ok;
    }
    //用户信息删除
    //用户信息修改
}
