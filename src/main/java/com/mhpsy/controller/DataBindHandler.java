package com.mhpsy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * 如果在类上加一个叫做@RestController这个注解 相当于给所有的方法上面都加上了@ResponseBody
 *  就不会被解析了
 */


@Controller
@RequestMapping("/data")
public class DataBindHandler {
    @RequestMapping("/baseType")
    @ResponseBody
    public String baseType(int id){
        return id+"";
    }

    @RequestMapping("/packageType")
    @ResponseBody
    public String packageType(Integer id){
        return id+"";
    }




}
