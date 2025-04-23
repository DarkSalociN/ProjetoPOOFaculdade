package main;

import BancoDeDados.BancoDeDados;
import Jogo.*;

public class Main {
    public static void main(String[] args) {
        Player p = Player.buscarPorId(1);
        if(p != null) {
            System.out.println("Player: " + p.getNome() + " " + "Vida: " + p.getVida() + " "+ "Defesa: " + p.getDefesa() + " "+ "Fome: " + p.getFome() + " "+ "Ferramenta: " + p.getFerramenta() + "\n");
        }else {
            System.out.println("Player não encontrado.");
        }


        NPCs villager = NPCs.buscarNPCsPorId(1);
        if(villager != null) {
            System.out.println("\nVillager: " + villager.getNome() + "\n");
        }else {
            System.out.println("Villager não encontrado.");
        }

        Ferramentas machado = Ferramentas.criarFerramentasPorId(1);
        if(machado != null) {
            System.out.println("\nMachado: " + machado.getNome() + "\n" + "Durabilidade: " + machado.getDurabilidade() + "\n");
        }else {
            System.out.println("Machado não encontrado.");
        }

        Drops tabua = Drops.criarDropsPorId(1);
        if(tabua != null) {
            System.out.println("\nTabua: " + tabua.getNome() + "\n");
        }else {
            System.out.println("Drop não encontrado. ");
        }
    }

}