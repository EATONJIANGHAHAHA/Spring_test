package com.eaton.annocation.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private ProductDao productDao;

    public CategoryDao getCategoryDao() {
        return categoryDao;
    }

    public void setCategoryDao(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void save() {
        System.out.println("ProductServide.save（）");
        categoryDao.save();
        productDao.save();
    }
}
