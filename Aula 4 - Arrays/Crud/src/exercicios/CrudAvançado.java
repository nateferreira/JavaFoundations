package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudAvançado {
    public static void main(String[] args) {
        ArrayList<String> nomesAlunos = new ArrayList<>();
        ArrayList<Double> notasAlunos = new ArrayList<>();
        ArrayList<Integer> idadesAlunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("Sistema CRUD de alunos");
            System.out.println("1- Cadastrar Alunos");
            System.out.println("2- Listar Alunos");
            System.out.println("3- Atualizar o cadastro do Aluno");
            System.out.println("4- Remover Aluno");
            System.out.println("5- Sair do Programa");

            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                //Cadastrar Aluno
                case 1:
                    System.out.println("Nome do aluno: ");
                    String nomeAluno = sc.nextLine();
                    sc.nextLine();

                    System.out.println("Idade do aluno: ");
                    int idadeAluno = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite a nota do aluno: ");
                    double notaAluno = sc.nextDouble();
                    sc.nextLine();

                    nomesAlunos.add(nomeAluno);
                    idadesAlunos.add(idadeAluno);
                    notasAlunos.add(notaAluno);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                //Listar Alunos
                case 2:
                    System.out.println("\n----Lista de alunos----");
                    for (int i = 0; i < nomesAlunos.size(); i++) {
                        System.out.println(i + " - Nome: " + nomesAlunos.get(i) +
                                " - Idade: " + idadesAlunos.get(i) +
                                " - Nota: " + notasAlunos.get(i));
                    } break;

                case 3:
                    System.out.println("\n----Atulizar Cadastro----");
                    System.out.println("Digite o ID do aluno: ");
                    int idAluno = sc.nextInt();

                    System.out.println("Nome do aluno: ");
                    String novoNomeAluno = sc.nextLine();
                    sc.nextLine();

                    System.out.println("Idade do aluno: ");
                    int novaIdadeAluno = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite a nota do aluno: ");
                    double novaNotaAluno = sc.nextDouble();
                    sc.nextLine();

                    nomesAlunos.set(idAluno, novoNomeAluno);
                    notasAlunos.set(idAluno, novaNotaAluno);
                    idadesAlunos.set(idAluno, novaIdadeAluno);

                    System.out.println("Aluno atualizado com sucesso!");
                    break;

                case 4:
                    System.out.println("\n----Excluir Cadastro----");
                    System.out.println("Digite o ID do aluno: ");
                    int idRemover  = sc.nextInt();
                    sc.nextLine();

                    nomesAlunos.remove(idRemover);
                    notasAlunos.remove(idRemover);
                    idadesAlunos.remove(idRemover);

                case 5:
                    System.out.println("Programa Encerrado!");
                    return;
                    
            }
        }
    }
}