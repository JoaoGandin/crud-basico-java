package org.example.jdbc;

import org.example.memoria.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {

    private Connection conn;

    public ProdutoDAO(Connection conn) {
        this.conn = conn;
    }

    public void salvar(Produto produto) {

        //A instrução SQL com espaços reservados (?)
        String sql = "INSERT INTO produtos (nome, preco) VALUES (?, ?)";

        // Utilizando PreparedStatement para evitar ataques de SQL Injection
        // O try-with-resources garante o fechamento automático da conexão
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());

            stmt.setBigDecimal(2, produto.getPreco());

            stmt.execute();

            System.out.println("Produto salvo com sucesso no banco de dados!");

        } catch (SQLException e) {
            // Se der erro de banco, a gente avisa o sistema e para o programa
            throw new RuntimeException("Erro ao salvar o produto: " + e.getMessage(), e);
        }
    }

}