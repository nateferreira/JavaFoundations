package desafios;

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {

        //Desafio 4: Conversor de Moedas
        //Desenvolva um programa que peça ao usuário um valor em reais e a moeda para a qual deseja converter:
        //1 - Dólar (R$ 1 = US$ 0.20).
        //2 - Euro (R$ 1 = € 0.18).
        //3 - Libra (R$ 1 = £ 0.15).
        //Use switch para calcular e mostrar o valor convertido.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em reais a ser convertido: ");
        double reais = sc.nextDouble();
        sc.nextLine();

        System.out.println("Informe a moeda que deseja converter: ");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Libra");
        System.out.println("A moeda escolhida foi");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                double dolar = reais * 0.2;
                System.out.println("Dolar US$ " + dolar);
                break;
            case 2:
                double euro = reais * 0.18;
                System.out.println("Euro € " + euro);
                break;
            case 3:
                double libra = reais * 0.15;
                System.out.println("Libra £ " + libra);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        sc.close();


    }
}
