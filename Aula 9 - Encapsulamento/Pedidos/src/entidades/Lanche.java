package entidades;

public class Lanche {
    // Atributos
   private String lanche;
   private double preco;

   // Constructor
    public Lanche(String lanche, double preco, int quantidade) {
        this.lanche = lanche;
        this.preco = preco;
    }

    // Getters e setters
    public String getLanche() {return lanche;}
    public void setLanche(String lanche) {this.lanche = lanche;}

    public double getPreco() {return preco;}
    public void setPreco(double preco) {this.preco = preco;}

    @Override
    public String toString() {
        return " | Lanche: " + lanche +
                " | Preço: " + preco + " R$";
    }
}
