package desafios;

import java.util.ArrayList;

public class Desafio01 {
    public static void main(String[] args) {
        // Desafio 01: Criação de uma Lista com Nomes e Filtragem Personalizada
        // Crie uma lista de nomes e filtre os que começam com uma letra específica.
        // Depois, exiba quantos nomes foram encontrados.
        // Exemplo:
        // Nomes encontrados que começam com "A": [Ana, Alice]
        // Total de nomes: 2

        // Criar lista
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("João");
        nomes.add("Adriano");
        nomes.add("Sabrina");
        nomes.add("Diego");
        nomes.add("Alice");
        nomes.add("Nathan");
        nomes.add("Thaís");
        nomes.add("Matheus");

        // Filtrar nome com a letra especifica
        nomes.removeIf(nome -> nome.charAt(0) != 'A');
        System.out.println(nomes.size());

        // Exibir nomes encontrados
        for (String nome : nomes){
            System.out.println(nome);
        }

    }
}
