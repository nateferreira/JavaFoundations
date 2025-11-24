package variaveis;

import java.util.Scanner;

public class EntradaDados {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // Metodo next - Capturar a palavra digitada pelo usuário
        System.out.println("Digite seu nome:");
        String nome = sc.next();
        sc.nextLine();
        System.out.println(nome);

        //Metodo nextline - Capturar a linha digitada pelo usuário
        System.out.println("Digite seu sobrenome:");
        String nomeCompleto = sc.nextLine();
        System.out.println(nomeCompleto);

        //Metodo nextInt - Capturar números inteiros
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.println("O " + nome + " tem " + idade + " anos");

        //Metodo nextDouble - Capturar numeros decimais
        System.out.println("Digite a sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("O " + nome + " tem " + idade + " anos" + " e mede " + altura + "m");

        sc.close();
    }
}
