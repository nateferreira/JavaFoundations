package desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

        // Desafio 2: Classificação de Triângulos (Aproveite o Desafio 01)
        //Crie um programa que receba três números, que você já sabe serem lados de um triângulo válido.
        //O programa deve classificar o triângulo nos seguintes tipos:
        //Equilátero: Todos os lados iguais.
        //Isósceles: Dois lados iguais.
        //Escaleno: Todos os lados diferentes.

        Scanner sc= new Scanner(System.in);

        System.out.println("Digite o lado A: ");
        int ladoA = sc.nextInt();
        System.out.println("Digite o lado B: ");
        int ladoB = sc.nextInt();
        System.out.println("Digite o lado C: ");
        int ladoC = sc.nextInt();

        boolean ladoAB = ladoA + ladoB > ladoC;
        boolean ladoAC = ladoA + ladoC > ladoB;
        boolean ladoBC = ladoB + ladoC > ladoA;

        if (ladoAB && ladoAC && ladoBC) {
            System.out.println("É possível formar um triângulo");

            if (ladoA == ladoB && ladoB == ladoC){
                System.out.println("Triângulo Equilátero");
            } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        }
        else {
            System.out.println("Não é possível forma um triângulo");
        }
        sc.close();
    }
}