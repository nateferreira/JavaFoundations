package desafios;

import java.util.ArrayList;

public class Desafio03 {
    public static void main(String[] args) {

        // Desafio 03: Verificar Elementos Duplicados
        // Crie uma lista de números e descubra quais números são numeros.
        // Crie uma nova lista somente com os números numeros.
        // Exemplo:
        // Lista de números: [10, 20, 5, 6, 9, 5]
        // Números duplicados: [10, 20,6]

        //Criar uma lista
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);

        // Filtrar números que são numeros
        for(int numero : numeros){
            int par = numero % 2;
            if (par == 0) {
                System.out.println("Os números par são " + numero);

                // Crie uma nova lista somente com numeros pares
                pares.add(numero);
            }
        }

        System.out.println("Lista de números: " + numeros);
        System.out.println("Números pares: " + pares);
    }
}
