package com.winston.rest.controller;


import com.winston.rest.domain.DemoStudent;
import com.winston.rest.service.DemoService;
import com.winston.rest.service.DemoServiceImpl;
import com.winston.rest.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author: winston
 * date: 10/29/2017.
 * description:
 *          @CrossOrigin 解决跨域问题
 *          提供安全机制
 *          1. 服务端生成token并保存，将token返回客户端作为用户标识；
 *          2. 客户端返回token写入cookie中，每次请求将token写入请求头中；
 *          3. 提供AOP切面拦截Controller方法，判断token有效性；
 *          4. 登出时，移除token，或设置过期时间；
 */
@RestController
@CrossOrigin
@RequestMapping("/restdemo")
public class DemoRestController {

    @Autowired
    DemoService demoService;


    @RequestMapping(value = "/students",method = RequestMethod.GET)
    public Response getStudents(){
        Response<List<DemoStudent>> response = new Response<List<DemoStudent>>();
        return  response.success(demoService.getStudents());

    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public Response getStudent(@PathVariable("id")String studentId){
        Response<List<DemoStudent>> response = new Response<List<DemoStudent>>();
        return response.success(demoService.getStudents());
    }






}
