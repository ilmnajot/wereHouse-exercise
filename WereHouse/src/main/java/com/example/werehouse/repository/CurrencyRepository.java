package com.example.werehouse.repository;

import com.example.werehouse.costomClasses.CustomCurrency;
import com.example.werehouse.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(
        path="currency",
        collectionResourceRel = "list",
        excerptProjection = CustomCurrency.class
)
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
