package com.eaton.annocation.demo3;

import org.springframework.stereotype.Component;

@Component
public class ProductDao {

    public void save() {
        System.out.println("ProducdDao.save()");
    }
}
