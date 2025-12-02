package desafios;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio01_Sala {
    public static void main(String[] args) {

        //Colocando Tudo Junto

        Scanner sc = new Scanner(System.in);
        int [] pontuacoes = new int[10];

        //Inserir as pontuações de 10 estudantes usando uma matriz.
        System.out.println("Digite as pontuações dos 10 estudantes:");
        for (int i = 0; i < pontuacoes.length; i++) {
            System.out.print("Pontuação do estudante " + (i + 1) + ": ");
            pontuacoes[i] = sc.nextInt();
        }

        //Exibir as pontuações que inseriu.
        System.out.println("\nAs pontuações inseridas são:");
        for (int i = 0; i < pontuacoes.length; i++) {
            System.out.println("Estudante " + (i + 1) + ": " + pontuacoes[i]);
        }

        //Calcular a média das pontuações que inseriu.
        int soma = 0;
        for (int i = 0; i < pontuacoes.length; i++) {
            soma += pontuacoes[i];
        }

        double media = soma / (double) pontuacoes.length;
        System.out.println("\nA média das pontuações é: " + media);

        sc.close();
    }
}
