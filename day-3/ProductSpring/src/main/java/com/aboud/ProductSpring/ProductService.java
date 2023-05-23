package com.aboud.ProductSpring;// Arraylist as library

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProductService {
    @Autowired
    ProductDB db;

//    public void addProduct(Product p){
//        db.add(p);
//    }

    public List<Product> getAllProducts(String name){

        return db.findAll();
    }
//
//    public Product getProduct(String name){
//        for(Product p : products){
//            if(p.getName().equals(name))
//                return p;
//        }
//
//        return null;
//    }


}