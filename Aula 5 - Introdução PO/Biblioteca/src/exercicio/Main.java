package exercicio;

public class Main {
    public static void main(String[] args) {

        Livro galinhaPintadinha = new Livro("Galinha Pintadinha",
                "Juliano Prado", "Ciranda Cultural", 22.9, 3);


        System.out.println(galinhaPintadinha.toString());

        galinhaPintadinha.alugaLivro(2);

        galinhaPintadinha.devolverLivro(1);
    }
}
