package Jogo;

import java.sql.*;

public class Ferramentas {
    private int id;
    private String nome;
    private int durabilidade;

    public Ferramentas() {}

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }

    public static Ferramentas criarFerramentasPorId(int id) {
        String url = "jdbc:postgresql://localhost:5432/BancoDeDados";
        String user = "postgres";
        String password = "pereira12";

        String sql = "SELECT * FROM \"Ferramentas\" WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Ferramentas f = new Ferramentas();
                f.id = rs.getInt("id");
                f.nome = rs.getString("nome");
                f.durabilidade = rs.getInt("Durabilidade");
                return f;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
