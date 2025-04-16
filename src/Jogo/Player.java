package Jogo;

public class Player {
    private String nome;
    private int vida, defesa, fome;

    public Player(String nome, int vida, int defesa, int fome) {
        this.nome = nome;
        this.vida = vida;
        this.defesa = defesa;
        this.fome = fome;

    }

    public void entrarNoMundo(){
        System.out.println("O player " + nome + " entrou no mundo.");
        System.out.println("Qual ação realizar?\n");
    }
}
