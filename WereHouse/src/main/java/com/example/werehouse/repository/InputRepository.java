package com.example.werehouse.repository;

import com.example.werehouse.costomClasses.CustomInput;
import com.example.werehouse.entity.Input;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
        path = "input",
        collectionResourceRel = "list",
        excerptProjection = CustomInput.class

)
public interface InputRepository extends JpaRepository<Input, Long> {
}
