package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um valor numérico: ");
            int valor = sc.nextInt();
            sc.nextLine();


            System.out.print("Digite um outro valor numérico: ");
            int valor2 = sc.nextInt();
            sc.nextLine();

            int divisao = valor / valor2;

            System.out.println("Resultado: " + divisao);

        } catch (InputMismatchException e) {
            System.out.println("Informe um valor numérico");
        } catch (ArithmeticException e) {
            System.out.println("Erro informe um valor diferente de zero" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }

        sc.close();
    }
}
