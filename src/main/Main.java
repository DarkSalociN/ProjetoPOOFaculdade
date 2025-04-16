package main;

import Jogo.Mundo;
import Jogo.NPCs;

public class Main {
    public static void main(String[] args) {
        Mundo jogo = new Mundo("Steve", "Bruta");
        jogo.iniciarJogo();

        NPCs villager = new NPCs("Villager", false);
        villager.SpawnNPc();

        NPCs villager2 = new NPCs("Villager", true);
        villager2.Interacao(jogo.getPersonagem());  //fazer um getter para retornar o nome correto do personagem
    }
}