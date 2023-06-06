package com.aboud.ProductSpringWEB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    //This is for product request
    @GetMapping("/product/{name}")
    public Product getProduct(String name){
        return service.getProduct(name);
    }
    @GetMapping("/products/findall/{name}")
    public  List<Product> getByText(@PathVariable String name)
    {
        return service.getProductWithText(name);
    }

    @GetMapping("/products/place/{place}")
    public  List<Product> getPlace(@PathVariable String place)
    {
        return service.getByPlace(place);
    }

    @GetMapping("/products/outwarranty")
    public  List<Product> getOutOfWarranty()
    {
        return service.getOutOfWarranty();
    }

    @GetMapping("/products/countoutwarranty")
    public  int countOutOfWarranty()
    {
        return service.countOutOfWarranty();
    }

    @GetMapping("/products/countproducts")
    public  int countproducts()
    {
        return service.countproducts();
    }

    @GetMapping("/products/counttypes")
    public  int counttypes()
    {
        return service.counttypes();
    }

    @GetMapping("/products/countplaces")
    public  int countplaces()
    {
        return service.countplaces();
    }

//    @PostMapping("/product")
//    public void addProduct(@RequestBody Product p)
//    {
//        service.addProduct(p);
//    }
}
