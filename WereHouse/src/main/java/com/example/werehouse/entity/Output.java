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
@Table(name="output_tbl")
public class Output {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private Integer facture_number;
    private String code;
    @OneToMany(mappedBy = "output")
    private List<Currency> currencies;
    @OneToMany(mappedBy="output")
    private List<WereHouse> wereHouses;
    @OneToMany(mappedBy = "output")
    private List<Client> clients;

}
