package com.example.werehouse.repository;

import com.example.werehouse.costomClasses.CustomCategory;
import com.example.werehouse.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(
        path="category",
        collectionResourceRel = "list",
        excerptProjection = CustomCategory.class
)
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
