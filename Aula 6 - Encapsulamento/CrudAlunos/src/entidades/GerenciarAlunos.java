package entidades;

import java.util.ArrayList;

public class GerenciarAlunos {
    private ArrayList<Aluno> alunos =  new ArrayList<Aluno>();

    // não possui constructor porque não vai ter valor

    // Metodo para adicionar o aluno na opção 1 do menu no main
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("\nAluno adicionado com sucesso");
    }

    // Metodo para listar o aluno na opção 2 do menu no main
    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("\nNenhum aluno encontrado");
        } else {
            for (int i = 0; i < alunos.size(); i++){
                System.out.println(i + alunos.get(i).toString());
            }
        }
    }
    // Metodo para atualizar o cadastro do aluno na opção 3 do menu no main
    public void atualizarAluno(int id, String nome, double nota, double nota2) {
        var aluno = alunos.get(id);
        aluno.setNome(nome);
        aluno.setNota(nota);
        aluno.setNota2(nota2);
        System.out.println("\nAluno atualizado com sucesso");
    }

    // Metodo para excluir o cadastro do aluno na opção 4 do menu no main
    public void excluirAluno(int id) {
        alunos.remove(id);
        System.out.println("\nAluno removido com sucesso");
    }
}