package com.example.werehouse.repository;

import com.example.werehouse.costomClasses.CustomMeasurement;
import com.example.werehouse.entity.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(
        path="measurement",
        collectionResourceRel = "list",
        excerptProjection = CustomMeasurement.class
)
public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
}
