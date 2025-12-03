package desafios;

import java.util.*;

public class Desafio05 {
    public static void main(String[] args) {

        // Desafio 05: Palavras de Comprimento Par ou Ímpar
        // Solicite que o usuário insira várias palavras.
        // Ordene-as pelo comprimento (do menor para o maior) e exiba o resultado.
        // Exemplo:
        // Palavras inseridas: [Java, Python, App, Aplicação]
        // Palavras com comprimento par: [Python, Aplicação]
        // Palavras com comprimento ímpar: [Java, App]


        ArrayList<String> listaPar = new ArrayList<>();
        ArrayList<String> listaImpar = new ArrayList<>();

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Caneta");
        lista.add("Caderno");
        lista.add("Copo");
        lista.add("Relógio");
        lista.add("Lâmpada");
        lista.add("Chave");
        lista.add("Telefone");
        lista.add("Bola");
        lista.add("Espelho");
        lista.add("Guitarra");

        lista.sort(Comparator.comparingInt(String::length));

        for (String palavra : lista) {

            if (palavra.length() % 2 == 0) {
                listaPar.add(palavra);
            } else {
                listaImpar.add(palavra);
            }
        }
            System.out.println("Palavras ordenadas por comprimento: ");
            System.out.println(lista);

            System.out.println("Palavras com comprimento par: ");
            System.out.println(listaPar);

            System.out.println("Palavras com comprimento impar: ");
            System.out.println(listaImpar);
        }
    }



