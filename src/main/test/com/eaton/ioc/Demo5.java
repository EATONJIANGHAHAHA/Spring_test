package com.eaton.ioc;

import com.eaton.ioc.demo5.CollectionBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo5 {

    @Test
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println(collectionBean);
    }
}
