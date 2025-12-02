package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        // Desafio 02: Soma e Média de Números
        // Crie uma lista de números inteiros.
        // Calcule a soma e a média de todos os números na lista.
        // Exemplo:
        // Lista de números: [10, 20, 30, 40]
        // Soma: 100
        // Média: 25.0

        //Criar lista
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;

        while (true) {
            System.out.println("Digite um numero [0 para parar]: ");
            int numero = sc.nextInt();
            if (numero == 0) {
                break;
            } else {
                numeros.add(numero);
            }
        }
        // Somar os números
        for (int numero : numeros) {
            soma += numero;
            System.out.println("A soma de todos é igual " + soma);

            //média de todos os numeros
            double media = soma / numeros.size();
            System.out.println("A média dos valores é " + media);

            sc.close();
        }
    }
}