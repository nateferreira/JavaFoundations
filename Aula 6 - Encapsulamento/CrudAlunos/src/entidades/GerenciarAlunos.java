package entidades;

import java.util.ArrayList;

public class GerenciarAlunos {
    private ArrayList<Aluno> alunos =  new ArrayList<Aluno>();

    // não possui constructor porque não vai ter valor

    // Adionar o aluno
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso");
    }





}
