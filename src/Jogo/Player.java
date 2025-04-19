package Jogo;

import java.sql.*;

public class Player {
    private int id;
    private String nome;
    private int vida;
    private int defesa;
    private int fome;
    private String ferramenta;

    // construtor + getters/setters

    public Player() {}

    //getter
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getDefesa(){
        return defesa;
    }

    public int getFome(){
        return fome;
    }

    public String getFerramenta() {
        return ferramenta;
    }

    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setFerramenta(String ferramenta) {
        this.ferramenta = ferramenta;
    }

    //Método para buscar no banco.


    public static Player buscarPorId(int id) {
        String url = "jdbc:postgresql://localhost:5432/BancoDeDados";
        String user = "postgres";
        String password = "pereira12";

        String sql = "SELECT * FROM \"Player\" WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Player p = new Player();
                p.id = rs.getInt("id");
                p.nome = rs.getString("nome");
                p.vida = rs.getInt("vida");
                p.defesa = rs.getInt("defesa");
                p.fome = rs.getInt("fome");
                p.ferramenta = rs.getString("ferramenta");
                return p;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
