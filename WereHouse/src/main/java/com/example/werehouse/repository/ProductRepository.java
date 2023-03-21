package com.example.werehouse.repository;

import com.example.werehouse.costomClasses.CustomProduct;
import com.example.werehouse.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
        path="product",
        collectionResourceRel = "list",
        excerptProjection = CustomProduct.class
)
public interface ProductRepository extends JpaRepository<Product, Long> {
}
