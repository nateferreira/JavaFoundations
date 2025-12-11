package entidades;

import java.util.ArrayList;

public class ListaPedido {
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    // Adicionar pedido na lista pedidos
    public void adicionarPedido(Pedido pedido) {
        if (pedido.getQuantidade() <= 0) {
            System.out.println("\nInforme um valor maior que zero");
        } else {
            pedidos.add(pedido);
            System.out.println("\nPedido adicionado com sucesso");
        }
    }
        public void listarPedidos(){
            for (int i = 0; i < pedidos.size(); i++) {
                System.out.println(" | " + i + pedidos.get(i));
            }
        }

        public void alterarPedido(int id, String nome, double precoUnitario, int quantidade) {
            if (quantidade <= 0) {
                System.out.println("\nInforme um valor maior que zero");
            } else {
                var pedido = pedidos.get(id);

                pedido.setNomeLanche(nome);
                pedido.setPreco(precoUnitario);
                pedido.setQuantidade(quantidade);
                System.out.println("\nPedido atualizado com sucesso!");
            }
        }

        public void removerPedido(int id) {
            pedidos.remove(id);
            System.out.println("\nPedido removido com sucesso!");
        }

        public double calcularTotal() {
            double total = 0;

            for (Pedido pedido : pedidos) {
                total += pedido.calcularTotal();
            }
            return total;
        }

}

