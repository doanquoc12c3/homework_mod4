package com.codegym.config;

import com.codegym.dao.IProductDao;
import com.codegym.dao.ProductDao;

import com.codegym.service.IProductService;
import com.codegym.service.ProductService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.codegym")
public class ApplicationConfig implements WebMvcConfigurer {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/product/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Bean
    public IProductDao productDao(){
        return new ProductDao();
    }

    @Bean
    public IProductService productService(){
        return new ProductService((ProductDao) productDao());
    }
}
