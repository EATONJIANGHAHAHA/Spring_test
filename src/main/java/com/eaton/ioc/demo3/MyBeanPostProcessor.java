package com.eaton.ioc.demo3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 后处理Bean，在每一个Bean生成的过程当中都会被执行，对类的生成进行增强，产生代理对象。
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        //System.out.println("第五步：初始化前方法");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(final Object o, String s) throws BeansException {
        //System.out.println("第八步：初始化后方法");
        if ("userDao".equals(s)) {
            Object proxy = Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if ("save".equals(method.getName())){
                        System.out.println("权限校验：");
                        return method.invoke(o, args);
                    }
                    return method.invoke(o, args);
                }
            });
            return proxy;
        }
        return o;
    }
}
