package com.merlin.backendeficiente.domain.cliente;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String cpf;
    private BigDecimal saldo;

    public Cliente() { }

    public Cliente(Long id, String nome, String cpf, BigDecimal saldo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
