package com.mhpsy.controller;

import com.mhpsy.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//在类定义处添加相当于变成一个控制器将这个类交给ioc容器来管理，（结合springmvc.xml的自动扫描配置使用）
//同时使其变成一个控制器，可以接受客户端请求
@RequestMapping("/hello")
//此时的访问路径变为了相当于“多了一层访问路径”http://localhost:8080/hello/index
public class helloHandler {
    @RequestMapping(value="/index",method = RequestMethod.GET,params = {"name","id=10"})
    //RequestMapping包含一个属性method可以定义访问方式
    //RequestMethod.GET是一个注解的类型
    //params表示请求必须要包含的参数
    //http://localhost:8080/hello/index?name=li&id=10
    //params = {"name","id=10"}表示仅仅支持id=10的请求
    //使用框架的话传参有点太简单了，甚至可以自动转型 简直是太方便了
    //想获取什么东西直接在参数这里给框架要
    //@RequestParam这个注解相当于给值做一个映射
    public String index(@RequestParam("name") String str,@RequestParam("id") int idNum){
        System.out.println(str+"==="+idNum);
        System.out.println("run index");
        return "index";
    }
//    public String index(String name,int id){
//        System.out.println(name+"==="+id);
//        System.out.println("run index");
//        return "index";
//    }

    /**
     * 这种风格的URL请求路径大致这样子http://localhost:8080/hello/rest/zhang/20
     * 也就是没有参数的名字只有/作为分隔符
     * 这种请求一定要使用@PathVariable来”制定（映射）“参数
     * @param name
     * @param id
     * @return
     */
    @RequestMapping("/rest/{name}/{id}")
    public String rest(@PathVariable("name") String name,@PathVariable("id") int id){
        System.out.println(name);
        System.out.println(id);
        return "index";
    }

    /**
     * 映射Cookie
     * 实际开发中这个功能使用的并不是很多
     * 知道有这个功能就可以了
     */
    @RequestMapping("/cookie")
    public String cookiePrint(@CookieValue("JSESSIONID") String sessionID){
        System.out.println(sessionID);
        return "index";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(User user){
        System.out.println(user);
        return "index";
    }

    /**
     * 默认情况下mvc处理使用的是转发
     * return "index";就相当于return "forward:index";
     */

    @RequestMapping("redirect")
    public String redirect(){
//这就是重定向 直接使用redirect:要去的路径
        return "redirect:/index.jsp";
    }


}
