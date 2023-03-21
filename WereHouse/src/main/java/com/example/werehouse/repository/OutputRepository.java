package com.example.werehouse.repository;

import com.example.werehouse.costomClasses.CustomOutput;
import com.example.werehouse.entity.Output;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(
        path = "output",
        collectionResourceRel = "list",
        excerptProjection = CustomOutput.class
)
public interface OutputRepository extends JpaRepository<Output, Long> {
}
