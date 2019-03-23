package com.eaton.aop.demo2;

/**
 * 目标类不能使用final,方法也不能使用final
 */
public class ProductDao {

    public void save(){
        System.out.println("保存商品");
    }

    public void update(){
        System.out.println("更新商品");
    }

    public void delete(){
        System.out.println("删除商品");
    }

    public void find(){
        System.out.println("查找商品");
    }
}
