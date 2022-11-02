package org.springframework.samples.petclinic.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepo;

    @Autowired
    public ProductService(ProductRepository productRepo){
        this.productRepo = productRepo;
    }

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }


    public List<Product> getProductsCheaperThan(double price) {
        return productRepo.findByPriceLessThan(price);
    }

    public List<ProductType> findAllProductTypes(){
        return productRepo.findAllProductTypes();
    }

    public ProductType getProductType(String typeName) {
        return productRepo.findProductTypeByName(typeName);
    }

    public Product save(Product p){
        return null;       
    }

    
}
