package com.example.werehouse.repository;

import com.example.werehouse.costomClasses.CustomClient;
import com.example.werehouse.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(
        path = "client",
        collectionResourceRel = "list",
        excerptProjection = CustomClient.class
)
public interface ClientRepository extends JpaRepository<Client, Long> {
}
