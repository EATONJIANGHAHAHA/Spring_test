package com.eaton.ioc;

import com.eaton.ioc.demo2.Bean2;
import com.eaton.ioc.demo2.Bean3;
import com.eaton.ioc.demo2.Bean1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {

    @Test
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 bean2 = (Bean1) applicationContext.getBean("bean1");
    }

    @Test
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
    }

    @Test
    public void demo3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean3 bean2 = (Bean3) applicationContext.getBean("bean3");
    }
}
