package com.mhpsy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
