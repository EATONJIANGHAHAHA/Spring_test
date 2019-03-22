package com.eaton.ioc;

import com.eaton.ioc.demo1.UserService;
import com.eaton.ioc.demo1.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {

    @Test
    /**
     * 传统方式
     */
    public void demo1() {
        UserService userService = new UserServiceImpl();
        userService.sayHellow();
    }

    @Test
    /**
     * spring方式
     */
    public void demo2() {
        //创建sping工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHellow();
    }
}
