package org.example.entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

}
