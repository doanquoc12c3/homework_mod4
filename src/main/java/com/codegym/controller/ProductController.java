package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    IProductService productService;
    @GetMapping
    public ModelAndView showListProduct(){
        ModelAndView modelAndView = new ModelAndView("list");
        List<Product> products = new ArrayList<>();
        products = productService.findAll();
        modelAndView.addObject("products",products);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showEditForm(){
        ModelAndView modelAndView = new ModelAndView("create");
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createProduct(@RequestParam String name,
                                      @RequestParam double price,
                                      @RequestParam String description,
                                      @RequestParam String imgURL){
        ModelAndView modelAndView = new ModelAndView("list");
        Product product = new Product(name,price,description,imgURL);
        productService.createProduct(product);
        List<Product> products = new ArrayList<>();
        products = productService.findAll();
        modelAndView.addObject("products",products);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("edit");
        Product product = productService.findById(id);
        modelAndView.addObject("product",product);
        return  modelAndView;
    }

    @PostMapping("/edit/{id}")
    public ModelAndView editProduct(@PathVariable int id,@RequestParam String name,
                                    @RequestParam double price,
                                    @RequestParam String description,
                                    @RequestParam String imgURL){
        ModelAndView modelAndView = new ModelAndView("list");
        Product product = new Product(name, price,description,imgURL);
        productService.editProduct(id, product);
        List<Product> products = new ArrayList<>();
        products = productService.findAll();
        modelAndView.addObject("products",products);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public  ModelAndView showDeleteForm(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("delete");
        Product product = productService.findById(id);
        modelAndView.addObject("product",product);
        return modelAndView;
    }

    @PostMapping("/delete/{id}")
    public ModelAndView deleteProduct(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("list");
        productService.deleteProduct(id);
        List<Product> products = new ArrayList<>();
        products = productService.findAll();
        modelAndView.addObject("products",products);
        return modelAndView;
    }
}
