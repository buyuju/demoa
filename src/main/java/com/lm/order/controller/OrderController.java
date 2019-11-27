package com.lm.order.controller;

import com.lm.order.model.base.ResultJson;
import com.lm.order.service.IUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author limeng
 * @Description 用户管理API
 * @Date @Date: 2019/2/13 10:37
 * @Modified by :
 **/
@RestController
public class OrderController {

    @Autowired
    private IUserService userService;

    @ApiOperation(value = "demo")
    @GetMapping(value= "/api/{version}/demo/user/")
    public ResultJson demo() {
        System.out.println(1);
        return ResultJson.success();
    }

}
