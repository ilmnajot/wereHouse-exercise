package com.example.werehouse.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users_tbl")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="code")
    private String code;
    @Column(name = "password")
    private String password;
    private boolean active;
    @ManyToMany
    @JoinTable(
            name = "user_werehouse",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "werehouse_id", referencedColumnName = "id")
    )
    private List<WereHouse> wereHouses;

}
