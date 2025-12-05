package desafio;

public class MainRoupa {
    public static void main(String[] args) {
        Roupa roupa1 = new Roupa("Hurley","Camiseta",
                "G", 89.90,9);

        System.out.println(roupa1.toString());
        System.out.println(roupa1.valorTotal());

        roupa1.comprar(2);

        roupa1.abastecer(15);

    }
}
