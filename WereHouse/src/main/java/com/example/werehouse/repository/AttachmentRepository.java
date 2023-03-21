package com.example.werehouse.repository;

import com.example.werehouse.costomClasses.CustomAttachment;
import com.example.werehouse.entity.Attachment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(
        path = "attachment",
collectionResourceRel = "list",
        excerptProjection = CustomAttachment.class)
@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, Long> {

//    @RestResource(path = "byName")
//    public Page<Attachment>findAllByName(@Param("name") String name, Pageable pageable);
}
