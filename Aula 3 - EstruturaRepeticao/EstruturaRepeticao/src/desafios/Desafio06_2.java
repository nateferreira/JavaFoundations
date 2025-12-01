package desafios;

import java.util.Scanner;

public class Desafio06_2 {
    public void main() {
        //Desafio 6: Soma de Dígitos de um Número
        //Peça ao usuário um número inteiro e, com um while,
        //some todos os seus dígitos (exemplo: 123 = 1 + 2 + 3 = 6).

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        int casa = 1;
        int soma = 0;
        int digito = 0;

        while (num > 0) {
            digito = (int) (num % Math.pow(10, casa));
            num -= digito;
            digito = (int) (digito / Math.pow(10,casa - 1));
            soma += digito;
            casa++;
        }
        System.out.println("A soma é igual a " + soma);

        sc.close();
    }
}
