package com.eaton.annocation.demo1;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {

    public void save() {
        System.out.println("dao中的保存用户");
    }
}
