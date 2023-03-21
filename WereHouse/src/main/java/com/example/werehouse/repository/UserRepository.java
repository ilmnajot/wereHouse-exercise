package com.example.werehouse.repository;

import com.example.werehouse.costomClasses.customUser;
import com.example.werehouse.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(
        path="user",
        collectionResourceRel = "list",
        excerptProjection = customUser.class
)
public interface UserRepository extends JpaRepository<User,Long> {
}
