package entidades;

import java.util.ArrayList;
// instanciar a classe
public class MenuLanches {
    private ArrayList<Lanche> cardapio = new ArrayList<>();

    // Inicializa a lista com os objetos lanches
    public MenuLanches() {
        cardapio.add(new Lanche("X-BURGUER",22));
        cardapio.add(new Lanche("X-EGG",24));
        cardapio.add(new Lanche("X-BACON",26));
        cardapio.add(new Lanche("X-SALADA",26));
        cardapio.add(new Lanche("X-FRANGO",26));
        cardapio.add(new Lanche("X-TUDO",30));
    }

    // Percorre a lista cardapio e mostra todos os lanches cadastrados
    public void exibirCardapio (){
        System.out.println("\n---Cardápio---");
        System.out.println("| ID | LANCHE | PREÇO |");
        for (int i = 0; i<cardapio.size(); i++){
            System.out.println(" | " + i + cardapio.get(i).toString());
        }
    }

    // Retornar o lanche a partir da sua posição da lista
    public Lanche getCardapio(int i){
        return cardapio.get(i);
    }

}