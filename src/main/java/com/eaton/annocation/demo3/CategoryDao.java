package com.eaton.annocation.demo3;

import org.springframework.stereotype.Component;

@Component
public class CategoryDao {

    public void save() {
        System.out.println("CategoryDao.save()");
    }
}
