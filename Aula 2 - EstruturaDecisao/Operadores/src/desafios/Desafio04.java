package desafios;

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {

        //Desafio 4: Sistema de Descontos
        //Peça o valor de uma compra e o número de itens adquiridos. Calcule o desconto:
        //Se o valor total for maior que R$ 300 ou o número de itens maior que 3, aplique 5%.
        //Se o valor total for maior que R$ 500 ou o número de itens maior que 5, aplique 10%.
        //Se o valor total for maior que R$ 1000, aplique 20%.
        //Caso contrário, não aplique desconto. Exiba o valor final com ou sem desconto.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor das compras: ");
        double compra = sc.nextDouble();
        System.out.print("Quantos itens foram comprados: ");
        int itens = sc.nextInt();

        if (compra > 1000) {
            double desconto1 = compra * 0.80;
            System.out.println("O valor com desconto é " + desconto1 + "R$");
        } else if (compra > 500 || itens > 5) {
            double desconto2 = compra * 0.90;
            System.out.println("O valor com desconto é " + desconto2 + "R$");
        } else if (compra > 300 || itens > 3){
            double desconto3 = compra * 0.95;
            System.out.println("O valor com desconto é " + desconto3 + "R$");
        } else {
            System.out.println("O valor com desconto é " + compra);
        }

        sc.close();
    }
}