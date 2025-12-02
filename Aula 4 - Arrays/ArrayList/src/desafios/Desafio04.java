package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {

        // Desafio 04: Remove Palavras que Contêm um Caracter Específico
        // Crie uma lista de palavras e remova todas que contêm uma letra específica fornecida pelo usuário.
        // Exemplo:
        // Palavras originais: [Banana, Maçã, Abacate, Manga]
        // Removendo palavras que contêm “a": []

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra para remover os itens da lista: ");
        String letra = sc.nextLine().toUpperCase();

        //Criar Lista
        ArrayList<String> objetos = new ArrayList<>();
        objetos.add("Caneta");
        objetos.add("Caderno");
        objetos.add("Copo");
        objetos.add("Relógio");
        objetos.add("Lâmpada");
        objetos.add("Chave");
        objetos.add("Telefone");
        objetos.add("Bola");
        objetos.add("Espelho");
        objetos.add("Guitarra");

        // Filtrar nome com a letra especifica
        objetos.removeIf(nome -> nome.contains(letra));

        // Exibir nomes encontrados
        for (String objeto : objetos){
            System.out.print(objeto + ", ");
        }

        sc.close();
    }
}
