import entidade.Carro;

public class Main {
    public static void main(String[] args) {
        Carro marca = new Carro("Corsa",
                2015, 120.5);

        marca.setAno(1700);
        marca.setVelocidadeMaxima(0);
        marca.setModelo("     ");
        System.out.println(marca.toString());
    }
}
