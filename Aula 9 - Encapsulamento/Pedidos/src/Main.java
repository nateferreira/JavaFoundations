import entidades.Cardapio;
import entidades.GerenciarPedidos;
import entidades.Lanche;
import entidades.Pedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cardapio cd = new Cardapio();
        GerenciarPedidos gerenciarPedidos = new GerenciarPedidos();

        int opcao;

        while(true){
            System.out.println("\n---Sistema de Pedidos---");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Listar item");
            System.out.println("3 - Atualizar pedido");
            System.out.println("4 - Excluir item");
            System.out.println("5 - Valor total");
            System.out.println("6 - Sair");
            System.out.println("\nEscolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1 -> {
                    cd.exibirLanches();

                    System.out.println("Digite o id do lanche: ");
                    int opcaoLanche = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite a quantidade: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    var lanche = cd.getLanche(opcaoLanche);
                    Pedido pedido = new Pedido(lanche.getLanche());


                    Lanche pedido = new Lanche(lanche, preco);
                    gerenciarPedidos.adicionarPedido(pedido);
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

                    System.out.println("Informe o valor do lanche: ");
                    double valorLanche = sc.nextDouble();
                    sc.nextLine();

                    gerenciarPedidos.atualizarPedido(numeroPedido, nomeLanche, valorLanche);
                }

                case 4 -> {
                    gerenciarPedidos.consultarPedidos();
                    System.out.println("Informe o número do pedido: ");
                    int numeroPedido = sc.nextInt();
                    sc.nextLine();
                    gerenciarPedidos.excluirPedido(numeroPedido);
                }

                case 5 -> {

                }

                case 6 -> {
                    System.out.println("\nObrigado e volte sempre =)");
                }

                default -> {
                    System.out.println("\n Escolha inválida.");
                }
            }
        }
    }
}
