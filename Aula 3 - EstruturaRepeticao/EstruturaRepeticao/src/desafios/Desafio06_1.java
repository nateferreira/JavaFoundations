package desafios;

import java.util.Scanner;

public class Desafio06_1 {
    public static void main() {
        //Desafio 6: Soma de Dígitos de um Número
        //Peça ao usuário um número inteiro e, com um while,
        //some todos os seus dígitos (exemplo: 123 = 1 + 2 + 3 = 6).

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        String numero = sc.nextLine();

        int soma = 0;
        int i = 0;

        while (i < numero.length()) {
            char c = numero.charAt(i);
            int digit = c - '0';
            soma += digit;
            i++;
        }
        System.out.println("A soma é igual a " + soma);

        sc.close();
    }
}