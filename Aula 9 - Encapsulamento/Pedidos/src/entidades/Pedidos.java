package entidades;

public class Pedidos {
    // Atributos
   private String lanche;
   private double preco;
   private int quantidade;

   // Constructor
    public Pedidos(String lanche, double preco, int quantidade) {
        this.lanche = lanche;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters e setters
    public String getLanche() {return lanche;}
    public void setLanche(String lanche) {this.lanche = lanche;}

    public double getPreco() {return preco;}
    public void setPreco(double preco) {this.preco = preco;}

    public int getQuantidade() {return quantidade;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}

    // Metodo para valor total
    public double calcularTotal() {return this.preco * this.quantidade;}

    @Override
    public String toString() {
        return " | Lanche: " + lanche +
                " | Preço: " + preco + " R$" +
                " | Quantidade: " + quantidade +
                " | Valor total: " + calcularTotal() + " R$";
    }
}
