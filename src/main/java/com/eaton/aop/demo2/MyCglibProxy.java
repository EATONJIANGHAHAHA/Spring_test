package com.eaton.aop.demo2;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib的原理是创建一个目标的子类并拓展接口，解决了Java的动态代理的局限性。
 */
public class MyCglibProxy {

    ProductDao productDao;

    public MyCglibProxy(ProductDao productDao) {
        this.productDao = productDao;
    }

    public Object createProxy() {
        //创建核心类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(productDao.getClass());
        //设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                if (method.getName().equals("save()")){
                    System.out.println("权限校验");
                    return methodProxy.invokeSuper(o, objects);
                }
                return methodProxy.invokeSuper(o, objects);
            }
        });
        //生成代理
        return enhancer.create();
    }
}
