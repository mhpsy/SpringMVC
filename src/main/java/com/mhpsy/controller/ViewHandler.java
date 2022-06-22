package com.mhpsy.controller;

import com.mhpsy.entity.Address;
import com.mhpsy.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/view")
public class ViewHandler {

//    @ModelAttribute
//    public User getUser(){
//        User user = new User();
//        user.setId(1L);
//        user.setName("lisi");
//        return user;
//    }
    @ModelAttribute
    public User getUser(){
        User user = new User();
        user.setId(1L);
        user.setName("lisi");
        return user;
    }
    @RequestMapping("/modelAttribute")
    public String modelAttribute(){
        return "view";
    }

    @RequestMapping("/map")
    public String map(Map<String,User> map){
        User user = getUser();
        map.put("user", user);
        return "view";
    }

    @RequestMapping("/model")
    public String model(Model model){
        User user = getUser();
        model.addAttribute("user",user);
        return "view";
    }

    @RequestMapping("/modelAndView")
    public ModelAndView modelAndView(){
        User user = getUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("view");
        return modelAndView;
    }




}
