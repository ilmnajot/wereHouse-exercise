package com.example.werehouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.condition.EnabledIf;

import java.util.List;

@Table(name = "input_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Input {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private String factureNumber;
    private String code;
    @OneToMany(mappedBy = "input")
    private List<Supplier> suppliers;
    @OneToMany(mappedBy = "input")
    private List<Currency> currencies;
}
