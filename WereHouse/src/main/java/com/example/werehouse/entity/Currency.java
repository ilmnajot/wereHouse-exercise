package com.example.werehouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="currency_tbl")
@Entity
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean active;
    @ManyToOne(optional = false)
    @JoinColumn(name = "input_id", referencedColumnName = "id")
    private Input input;

    @ManyToOne(optional = false)
    @JoinColumn(name = "output_id")
    private Output output;
}
