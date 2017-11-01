package com.winston.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * author: winston
 * date: 10/29/2017.
 * description:
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String getIndexPage(){
        return "index";
    }

}
