package com.codegym.dao;

import java.util.List;

public interface IGeneralDao<T> {
    boolean createProduct(T t);
    boolean editProduct(int id,T t);
    boolean deleteProduct(int id);
    List<T> findAll();
    T findById(int id);
}
