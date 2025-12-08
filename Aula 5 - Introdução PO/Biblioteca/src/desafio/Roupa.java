package desafio;

public class Roupa {

    String marca;
    String tipo;
    String tamanho;
    double preco;
    int quantidade;

    // Alt + Insert -> Constructor -> Selecionar todos os itens
    public Roupa(String marca, String tipo, String tamanho, double preco, int quantidade) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public double valorTotal() {
        return this.quantidade * this.preco;
    }

    //Decrementar
    public void venda(int quantidade) {
        if (quantidade < 0 || quantidade > this.quantidade) {
            System.out.println("Valor inválido");
        } else {
            this.quantidade -= quantidade;
            System.out.println("Venda realizada com sucesso");
        }
    }
    //Incrementar
    public void abastecer (int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("\nEstoque abastecido");
        } else {
            System.out.println("\nValor Inválido");
        }
    }
    // Alt + Insert -> toString -> dar enter e peseronalizar.
    public String toString() {
        return "Marca: " + this.marca +
                "\nTipo: " + this.tipo +
                "\nTamanho: " + this.tamanho +
                "\nQuantidade: " + this.quantidade +
                "\nPreço: " + this.preco +
                "\nValor total: " + this.valorTotal();
    }
}

