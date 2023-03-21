package com.example.werehouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "attachment_type_tbl")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AttachmentContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private byte aByte;
    @OneToMany(mappedBy = "attachmentContent")
    private List<Attachment> attachments;


}
