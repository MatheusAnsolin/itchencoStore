package com.itchencostore.itchencoStore.model;
import jakarta.persistence.*;

@Entity
@Table(name = "FotosProdutos")
public class FotoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    private String urlFoto;

// Getters and Setters
}