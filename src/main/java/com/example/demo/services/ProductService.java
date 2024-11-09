package services;
import com.example.demo.entity.Product;


import java.util.ArrayList;

public interface ProductService {
    Iterable<Product>  getProducts();
    Product getProductById(Integer id);
    Product addProduct(Product product);
    Product editProduct(Product product);
    void deleteProduct(Integer id);
}
