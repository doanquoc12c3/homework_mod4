package com.codegym.service;

import java.util.List;

public interface IGeneralProductService <T>{
    boolean createProduct(T t);
    boolean editProduct(int id,T t);
    boolean deleteProduct(int id);
    List<T> findAll();
    T findById(int id);
}
