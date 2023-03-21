package com.example.werehouse.repository;
import com.example.werehouse.costomClasses.CustomAttachmentContent;
import com.example.werehouse.entity.AttachmentContent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(
        path = "AttachmentContent",
        collectionResourceRel = "list",
        excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository  extends JpaRepository<AttachmentContent, Long> {

}
