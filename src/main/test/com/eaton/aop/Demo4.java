package com.eaton.aop;

import com.eaton.aop.demo4.CustomerDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo4 {

    @Resource(name = "customerDaoProxy")
    private CustomerDao customerDao;

    @Test
    public void demo1() {
        customerDao.find();
        customerDao.delete();
        customerDao.save();
        customerDao.update();
    }
}
