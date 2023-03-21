package com.example.werehouse.repository;

import com.example.werehouse.costomClasses.CustomSupplier;
import com.example.werehouse.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(
        path = "supplier",
        collectionResourceRel="list",
        excerptProjection = CustomSupplier.class
)
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
