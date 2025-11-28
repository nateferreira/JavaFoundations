package desafios;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {

        //Desafio 3: Média de Números com DO-WHILE
        //Peça ao usuário números até que ele digite 0. Calcule e exiba a média dos números digitados.

    Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            int resto = numero % 2;

            if (numero == 0) {
                System.out.println("Programa finalizado");
                break;
            } else {
                soma += numero;
            }

            int soma2 = soma / 4;
            System.out.println("A média dos números somados é " + soma2);

        }
    sc.close();
    }
}

