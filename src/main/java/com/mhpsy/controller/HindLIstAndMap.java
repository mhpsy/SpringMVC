package com.mhpsy.controller;

import com.mhpsy.entity.User;
import com.mhpsy.entity.UserList;
import com.mhpsy.entity.UserMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//如果在类上加一个叫做@RestController这个注解 相当于给所有的方法上面都加上了@ResponseBody
@RequestMapping("/hind")
@RestController
public class HindLIstAndMap {

    /**
     * 因为springMVC只能给“实体类”进行添加数据 所以这里创建了一个userList的类用来存放
     * List<User>
     * @return
     */
    @RequestMapping("/list")
    public String HindList(UserList userList){
        StringBuffer sb = new StringBuffer();
        for (User user : userList.getUserList()) {
            sb.append(user);
        }
        return sb.toString();
    }

    /**
     * 这个mvc热部署好像有点问题 如果感觉代码没问题 但是无论如何都无法运行 我的建议是重启serve
     * @param users
     * @return
     */
    @RequestMapping("/map")
    public String map(UserMap users){
        if(users==null){
            return "null";
        }
        StringBuffer sb = new StringBuffer();
        for (String key : users.getUsers().keySet()) {
            User user = users.getUsers().get(key);
            sb.append(user);
        }
        return sb.toString();
    }


    /**
     * 因为返回值要使用json所以直接返回对象就好了
     */
    @RequestMapping("/json")
    public User json(@RequestBody User user){
        System.out.println(user);
        user.setId(5);
        user.setName("abcd");
        return user;
    }


}
