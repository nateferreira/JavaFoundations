package desafios;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {

        //Desafio 3: Média de Números com DO-WHILE
        //Peça ao usuário números até que ele digite 0. Calcule e exiba a média dos números digitados.

    Scanner sc = new Scanner(System.in);
        double soma = 0;
        int contator = 0;


        while (true) {
            System.out.print("Digite um número: ");
            double numero = sc.nextInt();

            if (numero == 0) break;{
                soma += numero;
                contator++;
            }
            System.out.println("A média é igual a " + soma / contator);
        }

    sc.close();

    }
}

