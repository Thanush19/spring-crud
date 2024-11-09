 package com.example.demo.controller;


import com.example.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import services.ProductService;
@RestController
@RequestMapping("/products")  // Optional: Add a base path for your controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/get")  // /products/get
    public Iterable<Product> getProduct() {
        return productService.getProducts();
    }

    @PostMapping("/save")  // /products/save
    public Product postProduct(@RequestBody Product p) {
        return productService.addProduct(p);
    }

    @GetMapping("/get/{id}")  // /products/get/{id}
    public Product getProductById(@PathVariable Integer id) {
        return productService.getProductById(id);
    }

    @PutMapping("/put")  // /products/put
    public Product edit(@RequestBody Product p) {
        return productService.editProduct(p);
    }

    @DeleteMapping("/del/{id}")  // /products/del/{id}
    public void del(@PathVariable Integer id) {
        productService.deleteProduct(id);
    }
}
