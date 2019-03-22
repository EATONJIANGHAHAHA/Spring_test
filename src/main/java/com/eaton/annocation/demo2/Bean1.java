package com.eaton.annocation.demo2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bean1")
public class Bean1 {

    @PostConstruct //bean processor 的生命周期注解
    public void init() {
        System.out.println("init Bean");
    }

    public void say() {
        System.out.println("say...");
    }

    @PreDestroy //bean processor 的生命周期注解，默认作用范围都是单例。
    public void destory() {
        System.out.println("destroy Bean");
    }
}
