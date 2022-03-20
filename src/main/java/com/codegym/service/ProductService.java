package com.codegym.service;

import com.codegym.dao.IProductDao;
import com.codegym.dao.ProductDao;
import com.codegym.model.Product;

import java.util.List;

public class ProductService implements IProductService{
    private ProductDao productDao;
    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public boolean createProduct(Product product) {
        return productDao.createProduct(product);

    }

    @Override
    public boolean editProduct(int id, Product product) {
        return productDao.editProduct(id,product);
    }

    @Override
    public boolean deleteProduct(int id) {

        return productDao.deleteProduct(id);
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public Product findById(int id) {

        return productDao.findById(id);
    }
}
