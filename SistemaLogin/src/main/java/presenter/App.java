package presenter;

import com.meusistema.model.*;
import com.meusistema.model.DatabaseConnection;
import com.meusistema.view.TelaLogin; 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    
    public static void main(String[] args) {
        
        // Boas práticas do Swing: Iniciar na thread de eventos
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UsuarioDAO dao = new UsuarioDAO();
                dao.criarTabelaUsuario();
                listTables(DatabaseConnection.connect());
                //new TelaLogin().setVisible(true);
                //System.out.println(".run()");
            }

        });
    }
    
    public static void listTables(Connection conn) {
        // Consulta o sqlite_master para encontrar todas as tabelas
        String sql = "SELECT name FROM sqlite_master WHERE type='table' AND name NOT LIKE 'sqlite_%'";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n--- TABELAS EXISTENTES NO BANCO ---");
            boolean found = false;
            
            while (rs.next()) {
                String tableName = rs.getString("name");
                System.out.println("Tabela: " + tableName);
                found = true;
            }
            
            if (!found) {
                 System.out.println("Nenhuma tabela de usuário encontrada.");
            }

        } catch (SQLException e) {
            System.err.println("Erro ao listar as tabelas: " + e.getMessage());
        }
    }

}