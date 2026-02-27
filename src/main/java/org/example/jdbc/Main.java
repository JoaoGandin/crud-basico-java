package org.example.jdbc;

import org.example.memoria.model.Produto;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = ConnectionFactory.recuperarConexao()) {

            ProdutoDAO dao = new ProdutoDAO(conn);
            Produto meuProduto = new Produto("Tênis Chunky Oversized", new BigDecimal("250.00"));
            dao.salvar(meuProduto);

        } catch (SQLException e) {
            System.out.println("Deu ruim na conexão com o banco.");
            e.printStackTrace();
        }
    }
}