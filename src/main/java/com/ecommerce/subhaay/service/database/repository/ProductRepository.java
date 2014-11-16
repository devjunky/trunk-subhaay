package com.ecommerce.subhaay.service.database.repository;

import com.ecommerce.subhaay.service.database.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by jumange on 11/14/14.
 */
public interface ProductRepository extends MongoRepository<Product, String> {
}
