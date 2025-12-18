package com.example.lojaroupa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Informa qual tabela do banco se relaciona a entidade
@Table(name = "roupa")
// Informa que a classe Roupa é uma entidade JPA
// JPA - Mapea a classe para o banco.
@Entity(name = "Roupa")

// a Lombok cria todos itens abaixo
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Roupa {

    @Id // Informa que o id é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Informa que o banco gera do id
    private int id;
    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double valor;

    public Roupa(DadosRoupa dadosRoupa) {
        this.marca = dadosRoupa.marca();
        this.tipo = dadosRoupa.tipo();
        this.tamanho = dadosRoupa.tamanho();
        this.quantidade = dadosRoupa.quantidade();
        this.valor = dadosRoupa.valor();
    }
}
