package com.baozige.shanghai914.Controller.Payment;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "支付宝方式")
@RestController
@RequestMapping("payment")
public class AlipayController {
    @ApiOperation("获取支付方式")
    @GetMapping("ali/{meathd}")
    public R alipayment(@PathVariable String meathd){

    }
}
