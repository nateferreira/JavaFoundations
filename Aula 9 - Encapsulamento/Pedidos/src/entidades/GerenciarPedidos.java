package entidades;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GerenciarPedidos {
    private ArrayList<Pedidos> pedidos = new ArrayList<>();

    // metodo para adicionar o lanche no case 1 do menu main
    public void adicionarPedidos(Pedidos pedido){
        pedidos.add(pedido);
        System.out.println("\nPedido adicionado com sucesso!");
    }

    // metodo para consultar o lanche no case 2 do menu main
    public void consultarPedidos(){
        if (pedidos.isEmpty()) {
            System.out.println("\nNenhum pedido no carrinho.");
        } else {
            for (int i = 0; i < pedidos.size(); i++){
                System.out.println(i + pedidos.get(i).toString());
            }
        }
    }
    // Metodo para atualizar o pedido no carrinho na opção 3 do menu no main
    public void atualizarPedido(int numeroPedido, String lanche, int quantidade, double preco) {
        var pedido = pedidos.get(numeroPedido);
        pedido.setLanche(lanche);
        pedido.setQuantidade(quantidade);
        pedido.setPreco(preco);
        System.out.println("\nPedido atualizado com sucesso");
    }

    // Metodo para excluir o pedido do carrinho na opção 4 do menu no main
    public void excluirPedido(int numeroPedido) {
        pedidos.remove(numeroPedido);
        System.out.println("\nPedido removido do carrinho.");
    }
}
