package desafios;

import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {

        // Desafio 06 - Valor gasto pelo usuario.
        //Metodo de pagamento:
        // 1 - Dinheiro/Pix = 10% de desconto
        // 2 - Debito = 5% de desconto
        // 3 - Credito
        // 4 - A vista = Valor total
        // 5 - 2x = 5% de acrescimo - Valor de cada parcela
        // 6 - 3x = 10% de acrescimo - Valor de cada parcela

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor (R$): ");
        double valor = sc.nextDouble();
        sc.nextLine();

        System.out.println("Informe a forma de pagamento: ");
        System.out.println("1 - Pix");
        System.out.println("2 - Débito");
        System.out.println("3 - Crédito");
        System.out.println("A forma de pagamento escolhida foi");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                double pix = (valor * 0.9);
                System.out.println("Valor R$ " + pix);
                break;
            case 2:
                double debito = valor * 0.95;
                System.out.println("Valor R$ " + debito);
                break;
            case 3:
                System.out.println("Informe o número de parcelas: ");
                System.out.println("1 - À vista");
                System.out.println("2 - 2x");
                System.out.println("3 - 3x");
                int parcela = sc.nextInt();

                switch (parcela) {
                    case 1:
                        double uma = valor;
                        System.out.println("Valor R$ " + uma);
                        break;
                    case 2:
                        double duas = (valor * 1.05) / 2;
                        System.out.println("Valor R$ " + duas);
                        break;
                    case 3:
                        double tres = (valor * 1.1) / 3;
                        System.out.println("Valor R$ " + tres);
                        break;
                }
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }

        sc.close();


    }
}
