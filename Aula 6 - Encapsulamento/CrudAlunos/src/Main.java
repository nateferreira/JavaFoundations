import entidades.Aluno;
import entidades.GerenciarAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();

        int opcao;

        while  (true) {
            System.out.println("---Menu de Opções---");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Aluno");
            System.out.println("3 - Atualizar Aluno");
            System.out.println("4 - Excluir Aluno");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opcão: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o nome do aluno que deseja cadastrar: ");
                    String nome = sc.nextLine();

                    System.out.println("Informe a primeira nota do aluno: ");
                    double nota =  sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Informe a primeira nota do aluno: ");
                    double nota2 =  sc.nextDouble();
                    sc.nextLine();

                    Aluno aluno = new Aluno(nome, nota, nota2);
                    gerenciarAlunos.adicionarAluno(aluno);
                }

            }


        }

        sc.close();
    }
}
