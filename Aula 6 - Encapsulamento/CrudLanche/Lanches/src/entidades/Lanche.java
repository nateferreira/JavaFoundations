package entidades;

public class Lanche {

    //Atributos para lanche
    private String nome;
    private double precoUnitario;

    // Constructor - para inicializar os objetos com valores
    public Lanche(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    // Getters - Capturar as informações dos atributos privados
    //Setters - Atualizar as atributos privados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    // toString para exibir as informações dos atributos
    @Override
    public String toString() {
        return " | " + nome + " | R$ " + precoUnitario + " | ";
    }
}
