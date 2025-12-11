import entidades.ListaPedido;
import entidades.MenuLanches;
import entidades.Pedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuLanches menu = new MenuLanches();
        ListaPedido listaPedidos = new ListaPedido();
        int opcao;

        while (true){
            System.out.println("\n---MENU DE OPÇÕES---");
            System.out.println("1 - Cadastrar Lanche");
            System.out.println("2 - Listar Pedido");
            System.out.println("3 - Alterar Pedido");
            System.out.println("4 - Excluir Lanche");
            System.out.println("5 - Calcular Pedido");
            System.out.println("6 - Sair");
            System.out.print("\nEscolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1 -> {
                    menu.exibirCardapio();
                    System.out.print("\nEscolha uma opção desejada: ");
                    int opcaoLanche = sc.nextInt();
                    sc.nextLine();

                    var LancheEscolhido = menu.getCardapio(opcaoLanche);
                    System.out.println(LancheEscolhido.getNome());
                    System.out.println(LancheEscolhido.getPrecoUnitario());

                    System.out.print("\nDigite a quantidade desejada: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    Pedido pedido = new Pedido(LancheEscolhido.getNome(),
                            quantidade, LancheEscolhido.getPrecoUnitario());

                    listaPedidos.adicionarPedido(pedido);
                }

                case 2 -> {
                    listaPedidos.listarPedidos();
                }

                case 3 -> {

                    listaPedidos.listarPedidos();
                    System.out.print("\nInforme o id do Lanche que deseja alterar: ");
                    int idLanchePedido = sc.nextInt();
                    sc.nextLine();

                    menu.exibirCardapio();
                    System.out.print("\nInforme o lanche desejado: ");
                    int idLancheCardapio = sc.nextInt();
                    sc.nextLine();
                    var novoLanche = menu.getCardapio(idLanchePedido);

                    System.out.print("\nInforme a quantidade desejada: ");
                    int novaQuantidade = sc.nextInt();
                    sc.nextLine();

                    listaPedidos.alterarPedido(idLancheCardapio, novoLanche.getNome(), novoLanche.getPrecoUnitario(), novaQuantidade );
                }

                case 4 -> {
                    listaPedidos.listarPedidos();
                    System.out.println("\nInforme o id do Lanche que deseja excluir: ");
                    int idLanchePedido = sc.nextInt();
                    sc.nextLine();
                    listaPedidos.removerPedido(idLanchePedido);
                }

                case 5 -> {
                    System.out.println("\nO valor total foi R$" + listaPedidos.calcularTotal());
                }

                case 6 -> {
                    System.out.println("Programa finalizado");
                    return;
                }
            }
        }
    }
}