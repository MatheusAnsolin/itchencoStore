package com.itchencostore.itchencoStore.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Times")
public class Time {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String liga;

    @OneToMany(mappedBy = "time")
    private List<Produto> produtos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
// Getters and Setters
}