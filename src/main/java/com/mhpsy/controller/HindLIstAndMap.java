package com.mhpsy.controller;

import com.mhpsy.entity.User;
import com.mhpsy.entity.UserList;
import org.springframework.web.bind.annotation.RequestMapping;
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
    
}
