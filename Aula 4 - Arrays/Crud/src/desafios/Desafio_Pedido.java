package desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Desafio_Pedido {
    public static void main(String[] args) {
        // Crie um programa em Java que permita ao usuário gerenciar pedidos de lanches.
        // O sistema deve seguir a mesma lógica do exemplo anterior, porém aplicando ao controle de pedidos.
        // Regras do desafio:
        // Utilize ArrayList<String> para armazenar os lanches pedidos.
        // O menu deve apresentar as seguintes opções:
        // ===== SISTEMA DE PEDIDOS =====
        // 1 - Fazer pedido
        // 2 - Listar pedidos
        // 3 - Atualizar pedido
        // 4 - Cancelar pedido
        // 5 - Sair

        ArrayList<String> menuLanches = new ArrayList<>(Arrays.asList(
                "X-Burguer",
                "X-Egg",
                "X-Bacon",
                "X-Salada",
                "X-Tudo"
        ));

        ArrayList<Double> menuPreco = new ArrayList<>(Arrays.asList(
                22.90,
                24.90,
                28.90,
                26.90,
                40.00
        ));

        ArrayList<String> pedidos = new ArrayList<>();
        ArrayList<Integer> quantias = new ArrayList<>();
        ArrayList<Double> precos= new ArrayList<>();
        ArrayList<Double> valorTotal = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        while(true){
            System.out.println("\nSistema CRUD Pedidos de Lanche");
            System.out.println("1- Fazer pedido");
            System.out.println("2- Listar pedidos");
            System.out.println("3- Atualizar o pedido");
            System.out.println("4- Cancelar o pedido");
            System.out.println("5- Sair");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:

                    System.out.println("\n---- CARDÁPIO ----");
                    for (int i = 0; i < menuLanches.size(); i++) {
                        System.out.println(i + " - " + menuLanches.get(i) + " - " + menuPreco.get(i));
                    }
                    System.out.print("\nInforme o código do lanche: ");
                    int codigoLanche = sc.nextInt();
                    sc.nextLine();

                    String pedido = menuLanches.get(codigoLanche);
                    double preco = menuPreco.get(codigoLanche);

                    System.out.print("Informe a quantidade: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    double valor = quantidade*preco;
                    System.out.print("Valor Total: " + valor);

                    pedidos.add(pedido);
                    quantias.add(quantidade);
                    precos.add(preco);
                    valorTotal.add(valor);
                    System.out.println("\nPedido realizado!");
                    break;

                case 2:
                    System.out.println("\n ----Lista de pedidos----");

                    if (pedidos.isEmpty()) {
                        System.out.println("Nenhum pedido na sacola!");
                    } else {
                        for (int i = 0; i < pedidos.size(); i++) {
                            System.out.println("|" + i + " | - Lanche: " + pedidos.get(i) +
                                    " | - Quantidade: " + quantias.get(i) +
                                    " | - Valor: " + precos.get(i) +
                                    " | - Valor Total: " + valorTotal.get(i));
                        }
                    } break;

                case 3:
                    System.out.println("\n---- Atualizar Pedido ----");
                    System.out.println("Informe o número do pedido que deseja alterar:");
                    int codLanche = sc.nextInt();
                    sc.nextLine();

                    System.out.println("\n---- CARDÁPIO ----");
                    for (int i = 0; i < menuLanches.size(); i++) {
                        System.out.println(i + " - " + menuLanches.get(i) + " - " + menuPreco.get(i));
                    }

                    System.out.print("Informe o código do lanche: ");
                    int codigoNovoLanche = sc.nextInt();
                    sc.nextLine();

                    String novoPedido = menuLanches.get(codigoNovoLanche);
                    double novoPreco = menuPreco.get(codigoNovoLanche);

                    System.out.print("Informe a quantidade do pedido: ");
                    int novaQuantia = sc.nextInt();
                    sc.nextLine();

                    double novoValorTotal = novaQuantia*novoPreco;
                    System.out.print("Valor Total: " + novoValorTotal);

                    pedidos.set(codLanche,novoPedido);
                    quantias.set(codLanche, novaQuantia);
                    precos.set(codLanche, novoPreco);
                    valorTotal.set(codLanche, novoValorTotal);
                    System.out.println("\nPedido atualizado!");
                    break;

                case 4:
                    System.out.println("\n---- Cancelar pedido ----");
                    System.out.print("Informe o numero do pedido: ");
                    int numeroPedido = sc.nextInt();
                    sc.nextLine();

                    pedidos.remove(numeroPedido);
                    quantias.remove(numeroPedido);
                    precos.remove(numeroPedido);
                    System.out.println("\nPedido cancelado!");
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    return;
            }
        }
    }
}
