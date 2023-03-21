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
@Table(name = "category_tbl")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long parentCategoryId;
    private String name;
    private boolean active;
    @ManyToMany
    @JoinTable(name = "product_category",
            joinColumns = @JoinColumn(name="category_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="product_id", referencedColumnName = "id")
    )
    private List<Product> products;

}
