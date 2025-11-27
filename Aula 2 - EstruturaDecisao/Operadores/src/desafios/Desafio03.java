package desafios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {

        //Desafio 3: Calculadora de Seguro de Automóveis
        //Peça ao usuário sua idade, sexo e anos de experiência como motorista. Calcule o valor do seguro:
        //Para homens com menos de 25 anos e menos de 2 anos de experiência: R$ 2000.
        //Para mulheres com menos de 25 anos e menos de 2 anos de experiência: R$ 1800.
        //Para motoristas com mais de 25 anos ou mais de 2 anos de experiência: R$ 1200.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Quantos anos possui de experiência como motorista: ");
        int motorista = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite seu genero [M/F]: ");
        String genero = sc.nextLine();

        //Para homens com menos de 25 anos e menos de 2 anos de experiência: R$ 2000.
        if (idade <= 25 && motorista <= 2 && genero.equals("M")){
            System.out.println("O valor do seguro é R$ 2000,00");
        }
        //Para mulheres com menos de 25 anos e menos de 2 anos de experiência: R$ 1800.
        else if (idade <= 25 && motorista <=2 && genero.equals("F")) {
            System.out.println("O valor do seguro é R$ 1800,00");
        }
        //Para motoristas com mais de 25 anos ou mais de 2 anos de experiência: R$ 1200.
        else if (idade >= 25 && motorista >=2){
            System.out.println("O valor do seguro é R$ 1200,00");
        }
        sc.close();
    }
}
