package com.itchencostore.itchencoStore.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Tamanhos")
public class Tamanho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tamanho;
    private String tipo;

    @OneToMany(mappedBy = "tamanho")
    private List<Produto> produtos;

// Getters and Setters
}