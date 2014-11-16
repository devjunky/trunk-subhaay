package com.ecommerce.subhaay.service.database.dao;

import com.ecommerce.subhaay.service.database.model.Product;
import com.ecommerce.subhaay.service.database.repository.CommentRepository;
import com.ecommerce.subhaay.service.database.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jumange on 11/14/14.
 */
@Service
public class DaoHelperService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private ProductRepository productRepository;


    public List<Product> listProduct() {
        return productRepository.findAll();
    }

    public Product getProductById(String id) {
        return productRepository.findOne(id);
    }
}
