package org.example;


import org.example.entidades.GerenciarRoupas;
import org.example.entidades.Roupa;

public class Main {
    public static void main(String[] args) {
        GerenciarRoupas gerenciarRoupas = new GerenciarRoupas();
        Roupa roupa1 = new Roupa("Camisa", "G", 10, 59.99);

        gerenciarRoupas.cadastrarRoupa(roupa1);
    }
}
