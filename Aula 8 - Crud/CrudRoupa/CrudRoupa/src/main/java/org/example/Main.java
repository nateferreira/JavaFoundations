package org.example;


import org.example.entidades.GerenciarRoupas;
import org.example.entidades.Roupa;

public class Main {
    public static void main(String[] args) {
        GerenciarRoupas gerenciarRoupas = new GerenciarRoupas();
        Roupa roupa1 = new Roupa("Camisa", "G", 10, 59.99);
        Roupa roupa2 = new Roupa("Calça", "P", 15, 159.99);
        Roupa roupa3 = new Roupa("Shorts", "M", 20, 89.99);

       gerenciarRoupas.cadastrarRoupa(roupa1);
       gerenciarRoupas.cadastrarRoupa(roupa2);
       gerenciarRoupas.cadastrarRoupa(roupa3);

       gerenciarRoupas.excluirRoupa(2);

       gerenciarRoupas.alterarRoupa(10, "Camisa", "M", 20, 79.99);

       gerenciarRoupas.listarRoupas();
    }
}