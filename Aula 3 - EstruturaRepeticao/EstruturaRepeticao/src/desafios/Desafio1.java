package desafios;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Desafio1 {
    public static void main() {


    //Desafio 1: Fatorial de um Número
    //Peça ao usuário um número inteiro positivo e, usando um for, calcule o fatorial desse número.

    Scanner sc = new Scanner(System.in);
    System.out.print ("Digite um número: ");
    int numero = sc.nextInt();
    int fatorial = 1;

    if (numero < 0) {
        System.out.println("Fatorial não definido para números negativos.");
    } else {
        for (int i = 1; i <= numero; i++) {
           fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }

    sc.close();

    }
}