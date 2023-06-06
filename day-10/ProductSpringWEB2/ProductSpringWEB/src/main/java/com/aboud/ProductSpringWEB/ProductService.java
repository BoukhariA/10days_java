package com.aboud.ProductSpringWEB;// Arraylist as library

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    @Autowired
    ProductDB db;

//    public void addProduct(Product p){
//        db.add(p);
//    }

    public List<Product> getAllProducts(){

        return db.findAll();
    }

    public  Product getProduct(String name){
        return db.findByName(name);
    }
    public List<Product> getByPlace(String place) {
        // return db.findbyplace(place.toLowerCase());
        return db.findByPlace(place);
    }



    public List<Product> getOutOfWarranty()
    {
        return db.findproductsoutofWarranty();

    }

    public int countOutOfWarranty()
    {
        return db.countproductsoutofWarranty();

    }

    public int countproducts()
    {
        return db.totalproducts();

    }

    public int counttypes()
    {
        return db.totaltypes();

    }
    public int countplaces()
    {
        return db.totalplaces();

    }

    /*Assignment 1 - get Product From DB */
    public  List<Product> getProductByName(String name) {
        return (List<Product>) db.findByName(name);

    }


    /*Assignment-3:Converted To Stream API */
    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        return db.findByText(str);
    }

}


