package com.PangProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PangProject.entity.ProductEntity;
import com.PangProject.repo.IProductRepo;

@Service
public class ProductServiceImpl implements IProductService {


    @Override
    public List<ProductEntity> getAllProducts() {
        return null;
    }

    @Override
    public ProductEntity getProductById(Long id) {
        return null;
    }

    @Override
    public ProductEntity createProduct(ProductEntity product) {
        return null;
    }

    @Override
    public ProductEntity updateProduct(Long id, ProductEntity updatedProduct) {
        return null;
    }
    
    

    @Override
    public void deleteProduct(Long id) {
        
    }
}
