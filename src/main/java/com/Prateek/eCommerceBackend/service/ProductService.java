package com.Prateek.eCommerceBackend.service;

import com.Prateek.eCommerceBackend.model.Product;
import com.Prateek.eCommerceBackend.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;


    public List<Product> getAllProduct() {

        return repo.findAll();

    }

    public Product getProductBy(int id) {
        return repo.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageDate(imageFile.getBytes());
         return repo.save(product);

    }

    public Product getProductById(int productId) {
        return null;
    }

    public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException {
        product.setImageDate(imageFile.getBytes());
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
       return repo.save(product);
    }

    public void deleteProduct(int id) {
       repo.deleteById(id);

    }
}
