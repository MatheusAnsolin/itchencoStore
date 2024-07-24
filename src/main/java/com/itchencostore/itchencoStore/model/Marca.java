package com.itchencostore.itchencoStore.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Marcas")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "marca")
    private List<Produto> produtos;

// Getters and Setters
}