package com.eaton.aop;

import com.eaton.aop.demo2.MyCglibProxy;
import com.eaton.aop.demo2.ProductDao;
import org.junit.Test;

public class Demo2 {

    @Test
    public void demo1() {
        ProductDao productDao = new ProductDao();
        ProductDao proxy = (ProductDao) new MyCglibProxy(productDao).createProxy();
        proxy.save();
        proxy.update();
        proxy.delete();
        proxy.find();
    }
}
