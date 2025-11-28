package desafios;

import java.util.Scanner;

public class Desafio4 {
    public static void main (String[] args) {

        //Desafio 4: Número Par ou Ímpar com WHILE
        //Solicite números ao usuário, informando se são pares ou ímpares, e acumule as somas de números pares
        //e de números impares.
        //O programa encerra ao receber 0, exibindo as somas totais de pares e ímpares.

        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int soma2 = 0;

        while (true) {
                System.out.print("Digite um número: ");
                int numero = sc.nextInt();
                int resto = numero % 2;

                if (numero == 0) {
                    System.out.println("Programa finalizado");
                    break;
                }

                if (resto == 0) {
                    soma += numero;
                    System.out.println("A soma de todos números pares é " + soma);
                } else if (resto == 1) {
                    soma2 += numero;
                    System.out.println("A soma de todos números ímpares é " + soma2);
                }

        }

        sc.close();
    }
}