package Jogo;

public class NPCs {
    private String nome;
    private boolean shop = false;

    public NPCs(String nome, boolean shop) {
        this.nome = nome;
        this.shop = shop;
    }

    public void Interacao(Player player){
        System.out.println("Loja aberta escolha um item!\n");
    }

    public void SpawnNPc(){
        if(shop == false) {
            System.out.println("Npc " + nome + " apareceu!\n");
        }
    }
}
