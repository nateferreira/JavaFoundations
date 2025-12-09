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
            System.out.println("\n---Menu de Opções---");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Aluno");
            System.out.println("3 - Atualizar Aluno");
            System.out.println("4 - Excluir Aluno");
            System.out.println("5 - Sair");
            System.out.print("\nEscolha uma opcão: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o nome do aluno que deseja cadastrar: ");
                    String nome = sc.nextLine();

                    System.out.print("Informe a primeira nota do aluno: ");
                    double nota =  sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Informe a primeira nota do aluno: ");
                    double nota2 =  sc.nextDouble();
                    sc.nextLine();

                    Aluno aluno = new Aluno(nome, nota, nota2);
                    gerenciarAlunos.adicionarAluno(aluno);
                }

                case 2 -> {
                    gerenciarAlunos.listarAlunos();
                }

                case 3 -> {
                    gerenciarAlunos.listarAlunos();
                    System.out.print("\nInforme o id do aluno: ");
                    int idAluno = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Informe o nome do aluno: ");
                    String nomeAluno = sc.nextLine();

                    System.out.print("Informe a primeira nota do aluno: ");
                    double notaAluno = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Informe a segunda nota do aluno: ");
                    double nota2Aluno = sc.nextDouble();
                    sc.nextLine();

                    gerenciarAlunos.atualizarAluno(idAluno, nomeAluno, notaAluno, nota2Aluno);
                }

                case 4 -> {
                    gerenciarAlunos.listarAlunos();
                    System.out.print("\nInforme o id do aluno: ");
                    int idAluno = sc.nextInt();
                    sc.nextLine();
                    gerenciarAlunos.excluirAluno(idAluno);
                }

                case 5 -> {
                    System.out.println("\nPrograma finalizado com sucesso");
                    return;
                }

                default -> {
                    System.out.println("\nEscolha inválida!!");
                }
            }
        }
    }
}
