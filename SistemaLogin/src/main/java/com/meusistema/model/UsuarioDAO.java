package com.meusistema.model;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class UsuarioDAO {
    
    // Método para criar a tabela de usuários
    public void criarTabelaUsuario() {
        // SQL simples para login: id, usuario e senha
        String sql = "CREATE TABLE IF NOT EXISTS usuarios ("
                   + " id INTEGER PRIMARY KEY AUTOINCREMENT,"
                   + " usuario TEXT NOT NULL UNIQUE,"
                   + " senha TEXT NOT NULL"
                   + ");";
        
        // AQUI ESTÁ O SEGREDO: Chamamos a sua classe de conexão!
        try (Connection conn = DatabaseConnection.connect();
             Statement stmt = conn.createStatement()) {
            
            stmt.execute(sql);
            System.out.println("Tabela 'usuarios' verificada/criada com sucesso.");
            
        } catch (SQLException e) {
            System.err.println("Erro ao criar tabela: " + e.getMessage());
        }
    }
}