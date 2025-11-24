package variaveis;

import java.util.Scanner;

// Crie duas variaveis uma para armazenar a cidade aonde a pessoa mora e outra para armazenar a UF

public class Fixacao {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        //Cidade que você mora
        System.out.println("Digite a cidade:");
        String cidade = sc.nextLine();

        // Estado que você mora
        System.out.println("Digite o estado:");
        String estado = sc.nextLine();


        System.out.println("Cidade : " + cidade + " Estado: " + estado);

        // Crie variaveis que armazene a população e o tamanho da cidade
        System.out.println("Digite a população da cidade: ");
        int populacao = sc.nextInt();

        System.out.println("Digite o tamanho da cidade: ");
        double tamanho = sc.nextDouble();

        System.out.println("Cidade: " + cidade + "\nEstado: " + "\nTamanho: " + tamanho "km²" + "\nPopulação: " + populacao);

        sc.close();
    }
}
