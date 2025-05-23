package Jogo;

public class Mundo {
    private Player personagem;
    private Drops drops;
    private NPCs npcs;


    public Player getPersonagem() {
        return this.personagem;
    }


    public Mundo(String nomePersonagem, String tipoMadeira) {
        this.drops = new Drops(tipoMadeira);
        this.npcs = new NPCs("Villager", false);
    }

    public void iniciarJogo(){
        System.out.println("Jogo iniciado com sucesso!\n");
        drops.coletar();
        npcs.SpawnNPc();
    }
}
