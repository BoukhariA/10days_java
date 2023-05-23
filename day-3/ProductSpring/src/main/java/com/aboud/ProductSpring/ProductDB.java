package com.aboud.ProductSpring;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface ProductDB extends JpaRepository <Product, Integer>{
//    @Query("SELECT p FROM Product p WHERE p.name LIKE %?1%"
//            + " OR p.brand LIKE %?1%"
//            + " OR p.madein LIKE %?1%"
//            + " OR CONCAT(p.price, '') LIKE %?1%")
//    public List<Product> search(String keyword);
//}
//package com.aboud.ProductSpring;

//        import org.springframework.data.jpa.repository.JpaRepository;
//        import org.springframework.data.jpa.repository.Query;
//        import org.springframework.stereotype.Repository;
//
//        import java.util.List;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p WHERE p.name LIKE %?1%"
            + " OR p.type LIKE %?1%"
            + " OR p.place LIKE %?1%"
            + " OR CONCAT(p.warranty, '') LIKE %?1%")
    List<Product> search(String keyword);
}
