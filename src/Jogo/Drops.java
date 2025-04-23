package Jogo;

import java.sql.*;

public class Drops {
    private int id;
    private String nome;
    private int quantidade;

    public Drops(){}

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static Drops criarDropsPorId(int id) {
        String url = "jdbc:postgresql://localhost:5432/BancoDeDados";
        String user = "postgres";
        String password = "pereira12";

        String sql = "SELECT * FROM \"Drops\" WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Drops d = new Drops();
                d.id = rs.getInt("id");
                d.nome = rs.getString("nome");
                d.quantidade = rs.getInt("Quantidade");
                return d;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
