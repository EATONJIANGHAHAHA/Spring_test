package com.eaton.aop;

import com.eaton.aop.demo1.MyJdkProxy;
import com.eaton.aop.demo1.UserDao;
import com.eaton.aop.demo1.UserDaoImple;
import org.junit.Test;

public class Demo1 {

    /**
     * Java动态代理只能在实现了接口的类上进行。
     */
    @Test
    public void demo1() {
        UserDao userDao = new UserDaoImple();
        UserDao proxy = (UserDao) new MyJdkProxy(userDao).createProxy();
        proxy.save();
        proxy.update();
        proxy.delete();
        proxy.find();
    }
}
