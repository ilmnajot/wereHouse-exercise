package com.example.werehouse.repository;
import com.example.werehouse.costomClasses.customWereHouse;
import com.example.werehouse.entity.WereHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(
        path="wereHouse",
        collectionResourceRel = "list",
        excerptProjection = customWereHouse.class
)
public interface WereHouseRepository extends JpaRepository<WereHouse, Long> {
}
