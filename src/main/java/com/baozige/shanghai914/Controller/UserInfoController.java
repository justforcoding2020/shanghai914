package com.baozige.shanghai914.Controller;

import com.baozige.shanghai914.POJO.VO.UserInfoVo;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

public class UserInfoController {
    //用户信息修改
    @ApiOperation(value = "对用户信息进行删除")
    @PutMapping("admin/auth/update")
    public String removeUserInfo(@RequestParam Integer age, @RequestHeader String token){

        if (StringUtils.isBlank(number)) {
            return "非法删除，请输入具体正确手机号";
        }
        return number;
    }
}
