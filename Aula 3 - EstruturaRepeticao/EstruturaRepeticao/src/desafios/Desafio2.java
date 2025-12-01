package desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        // Desafio 2: Sequência de Fibonacci
        //Peça ao usuário um número inteiro N e utilize a estrutura de repetição for para exibir os primeiros N termos
        //da sequência de Fibonacci.
        //A sequência de Fibonacci é formada de tal maneira que cada número é a soma dos dois anteriores, começando
        //normalmente com os valores 0 e 1.

        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1, soma;

        System.out.println("Informe o termo que deseja saber: ");
        int termo = sc.nextInt();

        for (int i = 1; i <= termo; i++) {
            soma = a + b;

            System.out.print(a + ",");
            a = b;
            b = soma;
        }
        sc.close();
    }
}
