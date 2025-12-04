package exercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CrudMenuOpcoes {
    public static void main(String[] args) {
        ArrayList<String> menuLanches = new ArrayList<>(Arrays.asList(
            "X-Burguer",
            "X-Egg",
            "X-Bacon",
            "X-Salada",
            "X-Tudo"
        ));

        ArrayList<Double> menuPreco = new ArrayList<>(Arrays.asList(
                22.90,
                24.90,
                28.90,
                26.90,
                40.00
        ));

        System.out.println("----CARDÁPIO----");
        for (int i = 0; i < menuLanches.size(); i++) {
            System.out.println(i + " - " + menuLanches.get(i) + " - " + menuPreco.get(i));
        }


    }
}
