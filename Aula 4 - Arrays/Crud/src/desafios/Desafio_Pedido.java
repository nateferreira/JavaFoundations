package desafios;

import java.util.ArrayList;
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

        ArrayList<String> pedidos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        while(true){
            System.out.println("Sistema CRUD Pedidos de Lanche");
            System.out.println("1- Fazer pedido");
            System.out.println("2- Listar pedidos");
            System.out.println("3- Atualizar o pedido");
            System.out.println("4- Cancelar o pedido");
            System.out.println("5- Sair do Programa");

            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o pedido: ");
                    String pedido = sc.nextLine();
                    pedidos.add(pedido);
                    System.out.println("Pedido realizado!");
                    break;
                case 2:
                    System.out.println("\n ----Lista de pedidos----");

                    if (pedidos.isEmpty()) {
                        System.out.println("Nenhum pedido na sacola!");
                    } else {
                        for (String menu : pedidos) {
                            System.out.println(pedidos.indexOf(menu) + " - " + menu);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n---- Atualizar Pedido ----");
                    System.out.println("Informe o número do pedido: ");
                    int numero = sc.nextInt();
                    System.out.println("Informe o pedido: ");
                    String nomePedido = sc.nextLine();
                    pedidos.add(numero,nomePedido);
                    break;

                case 4:
                    System.out.println("\n---- Cancelar pedido ----");
                    System.out.println("Informe o numero do pedido: ");
                    int numeroPedido = sc.nextInt();
                    pedidos.remove(numeroPedido);
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
            }
            if (opcao == 5) {
                break;
            }
        }
    }
}
