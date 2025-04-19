package Jogo;

import java.sql.*;

public class NPCs {
    private int id;
    private String nome;
    private Integer[] shop;

    public NPCs(){}

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer[] getShop() {
        return shop;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setShop(Integer[] shop) {
        this.shop = shop;
    }

    public static NPCs buscarNPCsPorId(int id) {
        String url = "jdbc:postgresql://localhost:5432/BancoDeDados";
        String user = "postgres";
        String password = "pereira12";

        String sql = "SELECT * FROM \"NPCs\" WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                NPCs npc = new NPCs();
                npc.id = rs.getInt("id");
                npc.nome = rs.getString("nome");

                Array shopArray = rs.getArray("shop");
                if (shopArray != null) {
                    npc.shop = (Integer[]) shopArray.getArray();
                }
                return npc;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
