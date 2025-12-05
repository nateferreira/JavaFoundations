package exercicio;

public class Livro {
    String titulo;
    String autor;
    String editora;
    double preco;
    int quantidade;

    public Livro(String titulo, String autor, String editora,  double preco, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String toString(){
        return "Livro: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nEditora: " + this.editora +
                "\nQuantidade: " + this.quantidade +
                "\nPreço do Livro: " + this.preco + " R$" +
                "\nValor Total: " + this.valorTotal() + " R$";
    }

    //Decrementar
    public void alugaLivro (int quantidade) {
        if (quantidade < 0 || quantidade > this.quantidade) {
            System.out.println("\nValor inválido");
        } else {
            this.quantidade -= quantidade;
            System.out.println("\nLivro alugado com sucesso");
        }
    }

    //Incrementar
    public void devolverLivro (int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("\nLivro devolvido com sucesso");
        } else {
            System.out.println("\nValor Inválido");
        }
    }

    public double valorTotal() {
        return this.preco * this.quantidade;
    }
}