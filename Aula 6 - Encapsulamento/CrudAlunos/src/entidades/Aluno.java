package entidades;

public class Aluno {
    // Atritubutos
    private String nome;
    private double nota;
    private double nota2;

    // Constructor
    public Aluno(String nome, double nota, double nota2) {
        this.nome = nome;
        this.nota = nota;
        this.nota2 = nota2;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    // Metodo
    public double calcularMedia(){
        return (this.nota+this.nota2)/2;
    }

    @Override
    public String toString() {
        return " | Nome: " + this.nome + " | Nota: " + this.nota +
                " | Nota2: " + this.nota2 + " | Média: " + this.calcularMedia() + " | ";
    }
}
