package desafios;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {

        //Desafio 3: Adivinhe o Número
        //Crie um programa em Java que simula um jogo de adivinhação.
        //A máquina irá gerar um número inteiro aleatório entre 1 e 10 (inclusive).
        //O jogador terá uma tentativa para adivinhar o número.
        //O programa deverá exibir mensagens indicando se o jogador acertou ou errou.

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 0 a 10: ");
        int numero = sc.nextInt();

        int maquina = (int) (Math.random() * 10);

        if (numero == maquina) {
            System.out.println("Parabéns, você acertou");
            System.out.print("O número é " + maquina);
        }
        else {
            System.out.println("Você errou.");
            System.out.print("O número é " + maquina);
        }
        sc.close();
    }
}