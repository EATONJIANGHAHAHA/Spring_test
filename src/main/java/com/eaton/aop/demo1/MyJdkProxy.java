package com.eaton.aop.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyJdkProxy {

    UserDao userDao;

    public MyJdkProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    public Object createProxy() {
        Object proxy = Proxy.newProxyInstance(
                userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args)
                    throws Throwable {
                if (method.getName().equals("save")) {
                    System.out.println("权限校验");
                    return method.invoke(userDao, args); //执行原函数
                }
                return method.invoke(userDao, args); //执行原函数
            }
        });
        return proxy;
    }
}
