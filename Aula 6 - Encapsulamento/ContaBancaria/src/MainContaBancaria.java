import entidades.ContaBancaria;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria nathan = new ContaBancaria("Nathan",
                "151.155.041-79");

        System.out.println(nathan.getNome());
        System.out.println(nathan.getCpf());
        System.out.println(nathan.getSaldo());

        nathan.setNome("Nathan Ferreira");
        System.out.println(nathan.getNome());

        nathan.setCpf("805.080.900-15");
        System.out.println(nathan.getCpf());

        nathan.depositar(1000);
        nathan.sacar(500);
        System.out.println(nathan.getSaldo());
    }
}
