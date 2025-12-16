package org.example.entidades;

import java.sql.*;

public class GerenciarRoupas {
    private final String url =  "jdbc:mysql://localhost:3306/roupa";
    private final String user = "root";
    private final String password = "admin";

    // Metodo para conectar o banco de dados
    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    // Metodo para cadastrar um aluno
    public void cadastrarRoupa(Roupa roupa) {

        String sql = "INSERT INTO roupa (nome, tamanho, quantidade, valor) VALUES (?, ?, ?, ?)";

        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, roupa.getNome());
            stmt.setString(2, roupa.getTamanho());
            stmt.setInt(3, roupa.getQuantidade());
            stmt.setDouble(4, roupa.getValor());

            stmt.execute();
            System.out.println("Roupa cadastrada com sucesso!");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Metodo para excluir roupa
    public void excluirRoupa (int id) {
        String sql = "DELETE FROM roupa WHERE id = ?";

        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt (1, id);
            stmt.executeUpdate();

            System.out.println("Roupa deletada com sucesso!");
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Metodo para atualizar a roupa no cadastro da tabela
    public void alterarRoupa(int id, String nome, String tamanho, int quantidade, double valor) {
        String sql = "UPDATE roupa SET nome=?, tamanho=?, quantidade=?, valor=? WHERE id=?";

        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, tamanho);
            stmt.setInt(3, quantidade);
            stmt.setDouble(4, valor);
            stmt.setInt(5, id);

            stmt.executeUpdate();
            stmt.close();
            System.out.println("Roupa atualizada com sucesso!");

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Metodo para listar
    public void listarRoupas() {
        String sql = "SELECT * FROM roupa";

        try{
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(
                        " | " + rs.getString("id") +
                        " | " + rs.getString("nome") +
                        " | " + rs.getString("tamanho") +
                        " | " + rs.getInt("quantidade") +
                        " | " + rs.getDouble("valor") +
                        " | " + String.format("%.2f",calcularEstoque(rs.getInt("quantidade"), rs.getDouble("valor")))
                );
            }

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private double calcularEstoque(int quantidade, double valor) {
        return quantidade * valor;
    }

}
