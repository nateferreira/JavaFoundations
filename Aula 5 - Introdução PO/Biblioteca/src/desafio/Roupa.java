package desafio;

public class Roupa {

    String marca;
    String tipo;
    String tamanho;
    double preco;
    int quantidade;

    public Roupa(String marca, String tipo, String tamanho, double preco, int quantidade) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Decrementar
    public void comprar (int quantidade) {
        if (quantidade < 0 || quantidade > this.quantidade) {
            System.out.println("Valor inválido");
        } else {
            this.quantidade -= quantidade;
            System.out.println("Compra realizada com sucesso");
        }
    }
    //Incrementar
    public void abastecer (int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("\nEstoque abastecido com sucesso");
        } else {
            System.out.println("\nValor Inválido");
        }
    }

    public String toString() {
        return "Marca: " + this.marca +
                "\nTipo: " + this.tipo +
                "\nTamanho: " + this.tamanho +
                "\nQuantidade: " + this.quantidade +
                "\nPreço: " + this.preco;
    }

    public double valorTotal() {
        return quantidade * preco;
    }
}