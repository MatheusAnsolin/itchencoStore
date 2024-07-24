package com.itchencostore.itchencoStore.model;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Generos")
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String genero;

    @OneToMany(mappedBy = "genero")
    private List<Produto> produtos;

// Getters and Setters
}
