package desafios;

import java.util.Scanner;

public class Desafio01sala {
    public static void main(String[] args) {
        //Desafio 01
        //Criar um programa que some 6 valores digitados pelo usuário.
        //Porém o programa só vai somar valores ímpares e múltiplos de 3.

        Scanner sc = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <=6; i++) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            int resto =  numero % 2;
            int resto2 = numero % 3;

            if (resto == 1 && resto2 == 0) {
                 soma += numero;
            }
        }
        System.out.println("A soma de todos os valores ímpares é igual a " + soma);

        sc.close();
    }
}
