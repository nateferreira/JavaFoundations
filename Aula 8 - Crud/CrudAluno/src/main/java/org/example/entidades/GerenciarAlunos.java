package org.example.entidades;

import java.sql.*;

public class GerenciarAlunos {
    private final String url = "jdbc:mysql://localhost:3306/escola";
    private final String usuario = "root";
    private final String senha = "admin";

    //Metodo para conectar o banco de dados
    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }

    // Metodo para cadastrar um aluno
    public void cadastrarAluno (Aluno aluno){

        String sql = "INSERT INTO alunos (nome, nota, nota2)" +
                "VALUES (?, ?, ?)";

        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setDouble(2, aluno.getNota());
            stmt.setDouble(3, aluno.getNota2());

            stmt.executeUpdate();

            System.out.println("Aluno cadastrado com sucesso!");

        } catch (SQLException e) {
            System.out.println(e .getMessage());
        }
    }

    // Metodo para excluir o aluno do cadastro
    public void excluirAluno (int id){
        String sql = "DELETE FROM alunos WHERE id = ?";

        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            System.out.println("Aluno excluido com sucesso!");

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    // Metodo para atualizar o aluno do cadastro
    public void alterarAluno (int id, String nome, double nota, double nota2 ){
        String sql = "UPDATE alunos SET nome = ?, nota = ?, nota2 = ? WHERE id = ?";

        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setDouble(2, nota);
            stmt.setDouble(3, nota2);
            stmt.setInt(4, id);

            stmt.executeUpdate();
            stmt.close();
            System.out.println("Aluno atualizado com sucesso!");

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    // Metodo para listar
    public void listarAlunos(){
        String sql = "SELECT * FROM alunos";

        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                System.out.println(
                        " | " + rs.getString("id") +  " | " +
                                rs.getString("nome") + " | " +
                                rs.getDouble("nota") + " | " +
                                rs.getDouble("nota2") + " | " +
                                calcularMedia(rs.getDouble("nota"), rs.getDouble("nota2"))
                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private double calcularMedia(double nota, double nota2){
        return (nota + nota2)/2;
    }




}
