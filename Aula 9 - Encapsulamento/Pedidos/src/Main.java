import entidades.GerenciarPedidos;
import entidades.Pedidos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarPedidos gerenciarPedidos = new GerenciarPedidos();

        int opcao;

        while(true){
            System.out.println("\n---Menu de Lanches---");
            System.out.println("1 - Cadastrar pedido");
            System.out.println("2 - Consultar pedido");
            System.out.println("3 - Atualizar pedido");
            System.out.println("4 - Cancelar pedidos");
            System.out.println("5 - Sair");
            System.out.println("\nEscolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1 -> {
                    System.out.println("Digite o nome do lanche: ");
                    String lanche = sc.nextLine();

                    System.out.println("Informe a quantidade: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Informe o valor R$: ");
                    double preco = sc.nextDouble();
                    sc.nextDouble();

                    Pedidos pedido = new Pedidos (lanche, preco, quantidade);
                    gerenciarPedidos.adicionarPedidos(pedido);
                }

                case 2 -> {
                    gerenciarPedidos.consultarPedidos();
                }

                case 3 -> { gerenciarPedidos.consultarPedidos();
                    System.out.println("Informe o número do pedido: ");
                    int numeroPedido = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Informe o nome do lanche: ");
                    String nomeLanche = sc.nextLine();

                    System.out.println("Informe a quantidade do lanche: ");
                    int quantidadeLanche = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Informe o valor do lanche: ");
                    double valorLanche = sc.nextDouble();
                    sc.nextLine();

                    gerenciarPedidos.atualizarPedido(numeroPedido, nomeLanche, quantidadeLanche, valorLanche);
                }

                case 4 -> {
                    gerenciarPedidos.consultarPedidos();
                    System.out.println("Informe o número do pedido: ");
                    int numeroPedido = sc.nextInt();
                    sc.nextLine();
                    gerenciarPedidos.excluirPedido(numeroPedido);
                }

                case 5 -> {
                    System.out.println("\nObrigado e volte sempre =)");
                }

                default -> {
                    System.out.println("\n Escolha inválida.");
                }
            }
        }
    }
}
