package com.example.demo.services;

import com.example.demo.entity.Product;
import com.example.demo.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class ProductImpl implements services.ProductService {

    @Autowired
    private ProductRepo repo;
    @Override
    public Iterable<Product> getProducts(){
        return  repo.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return repo.getReferenceById(id);
    }

    @Override
    public Product addProduct(Product product) {
        return repo.save(product);
    }

    @Override
    public Product editProduct(Product product) {
        return repo.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
         repo.deleteById(id);

    }
}
