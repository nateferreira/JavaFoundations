package desafio;

import java.util.Scanner;

public class MainCadastro {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Cadastro produto1 = new Cadastro();

     System.out.println("Digite o produto que deseja cadastrar: ");
     produto1.nome = sc.nextLine();

     System.out.println("Digite a quantidade do produto: ");
     produto1.quantidade = sc.nextInt();
     sc.nextLine();

     System.out.println("Digite o valor do produto: ");
     produto1.preco = sc.nextDouble();
     sc.nextLine();


     System.out.println("| Nome do produto: " + produto1.nome +
             " | Quantidade: " + produto1.quantidade +
             " | Preço: " + produto1.preco + " R$" +
             " | Valor total em Estoque: " + produto1.calcularTotal() + " R$ |");

     sc.close();
    }
}
