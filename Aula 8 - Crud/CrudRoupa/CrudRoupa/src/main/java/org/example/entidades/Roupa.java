package org.example.entidades;

public class Roupa {
    private String nome;
    private String tamanho;
    private int quantidade;
    private double valor;

    // Contructors
    public Roupa(String nome, String tamanho, int quantidade, double valor) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Metodo para calcular
    public double  calcularTotal(){
        return this.quantidade * this.valor;
    }

    // .toString

    @Override
    public String toString() {
        return "| " + nome + " | " + "Tamanho: " + tamanho + " | " +
                "Quantidade: " + quantidade + " | " + "Preço R$:" + valor;
    }
}
