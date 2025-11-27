package exercicios;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Você é estudante [S/N]: ");
        String estudante = sc.nextLine();

        System.out.println("Você é professor [S/N]: ");
        String professor = sc.nextLine();

        if (idade <=12 || idade >= 65) {
            System.out.println("Você está em uma faixa de idade, com entrada gratuita");
        } else if (estudante.equals("S") || professor.equals("S")) {
            System.out.println("Entrada gratuita");
        }else{
            System.out.println("Paga inteira");
        }
       sc.close();
    }
}
