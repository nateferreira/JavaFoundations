import entidades.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class Cola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno("Nathan",10,10);
        System.out.println(aluno.toString());


        ArrayList<Aluno> alunos = new ArrayList<>();

        //Adicionar Alunos
        alunos.add(aluno);
        alunos.add(aluno);

        // Exibir os dados do aluno com a sua posição
        System.out.println(alunos.get(0).toString());

        // Percorrer todos os alunos da lista
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(" | " + i + alunos.get(i).toString());
        }

        // Alterar os dados da lista
        // 1 - criar a variavel com var para armazenar um tipo de valor.
        var verAluno = alunos.get(1);

        // 2 - Alterar os dados na variavel nova
        verAluno.setNota(8);
        verAluno.setNota2(8);
        verAluno.setNome("Thaís");
        System.out.println(alunos.get(1).toString());

        // Excluir um aluno da lista
        alunos.remove(1);

        sc.close();
    }
}