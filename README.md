# SpringMVC
review SpringMVC

## SpringMVC 模型数据解析
JSP四大作用于 pageContext、request、session、application
模型数据的绑定是由ViewResolver来完成的，实际开发中，我们需要先添加模型数据，再交给ViewResolver来绑定
SpringMVC 提供了以下几种方式来添加模型数据：
- Map
- Model
- ModelAndView
- @SessionAttribute
- @ModelAttribute

### ModelAndView
ModelAndView使用起来超级灵活非常方便
最主要的方式就是
- setViewName("此处填入视图的名字")
- addObject(key,value)
- 还有就是构造方法可以直接设置view的名字
- 也可以实际new一个view的对象 然后setView
- 关于ModelAndView的构造方法有很多个 对Map集合的支持也是很好的
- 直接创建一个Map集合，返回"view"也是可以直接用EL表达式取出来value的
- Map集合也可以当作构造方法的第二个参数，第一个参数填写view的名字
- ......这里的方法很多 可以直接去看源码 总之用起来很方便
- 当然也可以直接去使用HttpServletRequest然后request.setAttribute()
#### 注解的方式添加
- @ModelAttribute
  - 定义一个方法，该方法专门用来返回要填充到模型数据中的对象
```java
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
```
- 在@ModelAttribute这个注解下面的"东西"就会被返回
- 事实上也是可以不return一个"值"的 但是这就需要在被@ModelAttribute注解修饰过的方法下面手动的添加Map集合之类的去"处理"
- 添加数据这个工作总要有人做的
```java
@ModelAttribute
public void getUser(Map<String , User> map){
    User user = new User();
    user.setId(1L);
    user.setName("lisi");
    map.put("user",user);
}
@RequestMapping("/modelAttribute")
public String modelAttribute(){
    return "view";
}
```
- 这样也是可以的，就是不返回值 而是手动的给map集合里面添加东西
- 同样的道理如果给Model.addAttribute(key,value)也是可以的









