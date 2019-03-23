package com.eaton.aop;
import com.eaton.aop.demo3.StudentDao;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo3 {

    //注入代理对象使其增强。
    @Resource(name = "studentDaoProxy")
    private StudentDao studentDao;

    @Test
    public void demo1() {
        studentDao.save();
        studentDao.find();
        studentDao.update();
        studentDao.delete();
    }
}
