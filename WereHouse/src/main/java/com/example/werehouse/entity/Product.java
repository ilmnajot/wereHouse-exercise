package com.example.werehouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product_tbl")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private boolean active;

    @ManyToOne(optional = false)
    @JoinColumn(name="output_id")
    private Output output;

    @OneToMany
    @JoinColumn(name = "attachmentList_id")
    private List<Attachment> attachmentList;

    @ManyToMany(mappedBy = "products")
    private List<Category> categories;
}
