package com.eaton.annotation;

import com.eaton.annocation.demo3.ProductService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo3 {

    @Test
    public void test() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) applicationContext.getBean("productService");
        productService.save();
    }
}
