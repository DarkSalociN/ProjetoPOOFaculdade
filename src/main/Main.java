package main;

import BancoDeDados.BancoDeDados;
import Jogo.Mundo;
import Jogo.NPCs;
import Jogo.Player;

public class Main {
    public static void main(String[] args) {
        Player p = Player.buscarPorId(1);
        if(p != null) {
            System.out.println("Player: " + p.getNome() + " " + "Vida: " + p.getVida() + " "+ "Defesa: " + p.getDefesa() + " "+ "Fome: " + p.getFome() + " "+ "Ferramenta: " + p.getFerramenta());
        }else {
            System.out.println("Player não encontrado.");
        }


        NPCs villager = NPCs.buscarNPCsPorId(1);
        if(villager != null) {
            System.out.println("Villager: " + villager.getNome());
        }else {
            System.out.println("Villager não encontrado.");
        }

    }

}