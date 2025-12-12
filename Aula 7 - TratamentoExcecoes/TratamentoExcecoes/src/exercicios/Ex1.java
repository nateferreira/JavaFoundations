package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Digite uma nota: ");
            double nota = sc.nextDouble();
            sc.nextLine();

            System.out.print("Digite outra nota: ");
            double nota2 = sc.nextDouble();
            sc.nextLine();

            double media = (nota + nota2) / 2;
            System.out.print("Sua média é: " + media);


        } catch (InputMismatchException e) {
            System.out.println("Erro, informe um valor numérico.");
        }

        sc.close();
    }
}
