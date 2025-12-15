package org.example.entidades;

public class Aluno {
    private String nome;
    private double nota;
    private double nota2;

    // Constructor
    public Aluno(String nome, double nota, double nota2) {
        this.nome = nome;
        this.nota = nota;
        this.nota2 = nota2;
    }

    // Getter e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (this.nota * this.nota2)/2;
    }

    @Override
    public String toString() {
        return " | " + "Nome: " + nome + " | " +
                "Nota: " + nota + ", " +
                nota2 + " | " + "Media: " + calcularMedia();
    }
}
