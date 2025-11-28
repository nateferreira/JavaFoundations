package desafios;

import java.util.Scanner;

public class Desafio02sala {
    public static void main(String[] args) {
         //Crie um programa desafiando a máquina.
        //A máquina vai gerar um número entre 0 a 100 e você vai tenttar
        //acertar esse numero.
        //O programa só vai encerrar quando você acertar o número.
        //informe se o valor que o usuário digitou é maior ou menor o que gerou.

        Scanner sc = new Scanner(System.in);

        int maquina = (int) (Math.random() * 101);

        while (true){
            System.out.print("Digite um numero de 0 a 100: ");
            int numero = sc.nextInt();

            if (numero == maquina){
                System.out.println("Parabéns, você acertou!");
                break;
            } else if (numero < maquina){
                System.out.println("O número é maior!");
            } else if (numero > maquina){
                System.out.println("O número é menor!");
            }

        }

        sc.close();
    }
}




