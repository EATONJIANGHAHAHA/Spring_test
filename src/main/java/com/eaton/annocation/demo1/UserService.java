package com.eaton.annocation.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Spring的Bean注解方式
 */
@Component("userService")
public class UserService {

    @Value("米饭")
    private String something;
    @Autowired //默认按照类型注入，如果类型相同，按照名称进行注入，可以单独使用。
    @Qualifier("userDao")//按照名字进行注入，使用之后强制按照名字使用，必须配合autowired
    //@Resource 的功能等同于上两行
    private UserDao userDao;

    public String sayHellow(String name) {
        return "hello" + name;
    }

    public void eat() {
        System.out.println("eat: " + something);
    }

    public void save() {
        System.out.println("Service中的保存用户方法");
        userDao.save();
    }
}
