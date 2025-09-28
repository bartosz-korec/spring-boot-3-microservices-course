package com.bartoszkorec.microservices.product.repository;

import com.bartoszkorec.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
