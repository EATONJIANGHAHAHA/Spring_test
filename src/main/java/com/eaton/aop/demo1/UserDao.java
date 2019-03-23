package com.eaton.aop.demo1;

/**
 * 接口中的方法不能使用final, 因为它的子类无法实现final方法
 */
public interface UserDao {

    public void save();
    public void update();
    public void delete();
    public void find();

}
