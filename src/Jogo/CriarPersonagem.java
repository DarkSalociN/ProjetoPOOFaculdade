package Jogo;

public class CriarPersonagem {
    private String nome;

    public CriarPersonagem(String nome) {
        this.nome = nome;
    }

    public void entrarNoMundo(){
        System.out.println("O player " + nome + " entrou no mundo.");
        System.out.println("Qual ação realizar?");
    }
}
