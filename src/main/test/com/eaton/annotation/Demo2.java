package com.eaton.annotation;

import com.eaton.annocation.demo2.Bean1;
import com.eaton.annocation.demo2.Bean2;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {

    @Test
    public void demo1() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 bean = (Bean1) applicationContext.getBean("bean1");
        bean.say();
        applicationContext.close();
    }

    @Test
    public void demo2() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean2 bean1 = (Bean2) applicationContext.getBean("bean2");
        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
        System.out.println(bean2 == bean1);
    }
}
