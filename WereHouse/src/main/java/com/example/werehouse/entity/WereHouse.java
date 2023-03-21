package com.example.werehouse.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "werehouse_tbl")
public class WereHouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private boolean active;

    @ManyToOne
    @JoinColumn(name = "input_id", referencedColumnName = "id")
    private Input input;

    @ManyToOne(optional = false)
    @JoinColumn(name = "output_id")
    private Output output;
}
