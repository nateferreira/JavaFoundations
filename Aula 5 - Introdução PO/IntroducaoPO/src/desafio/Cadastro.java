package desafio;

public class Cadastro {
    //Atributos
    String nome;
    int quantidade;
    double preco;


    //Metodo
    public double calcularTotal(){
        double total = quantidade * preco;
        return total;

    }
}
