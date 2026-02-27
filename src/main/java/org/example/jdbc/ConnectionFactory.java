package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    // O método é static para podermos chamar direto pelo nome da classe
    public static Connection recuperarConexao() {
        try {
            // URL de conexão, Usuário e Senha
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_basico", "usuario", "sua_senha");

        } catch (SQLException e) {
            // Se der erro (senha errada, banco desligado), o programa lança uma exceção e para.
            throw new RuntimeException("Erro ao conectar ao banco de dados!", e);
        }
    }
}