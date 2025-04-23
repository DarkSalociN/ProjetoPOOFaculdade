package BancoDeDados;

import Jogo.NPCs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BancoDeDados {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/BancoDeDados";
        String user = "postgres";
        String password = "pereira12";

        String sql = "INSERT INTO usuario (nome, email) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1,"João");
            stmt.setString(2,"Joao@email.com");

            stmt.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    

    public static NPCs buscarNPCsPorId(int i) {
    return null;
    }
}
