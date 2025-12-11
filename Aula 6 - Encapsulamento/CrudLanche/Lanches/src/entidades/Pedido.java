package entidades;

public class Pedido {

    // Atributos para a classe
    private String nomeLanche;
    private int quantidade;
    private double preco;

    // Inicializa o pedido com os valores do lanche


    public Pedido(String nomeLanche, int quantidade, double preco) {
        this.nomeLanche = nomeLanche;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Getters - Consultar atributos privados
    // Setters - Atualizar atributos privados
    public String getNomeLanche() {
        return nomeLanche;
    }
    public void setNomeLanche(String nomeLanche) {
        this.nomeLanche = nomeLanche;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Metodo para calcular total
    public  double calcularTotal(){
        return this.quantidade * this.preco;
    }

    @Override
    public String toString() {
        return " | " + nomeLanche + " | " + quantidade +
               " | R$ " + preco + " | R$ " + calcularTotal() + " | ";
    }
}
