package com.itchencostore.itchencoStore.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "Produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "time_id")
    private Time time;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "tamanho_id")
    private Tamanho tamanho;

    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;

    private BigDecimal preco;

    private Integer quantidadeEmEstoque;

    private String descricao;

    @OneToMany(mappedBy = "produto")
    private List<FotoProduto> fotos;

// Getters and Setters
}