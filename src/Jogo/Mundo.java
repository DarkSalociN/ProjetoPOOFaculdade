package Jogo;

public class Mundo {
    private Player personagem;
    private Madeira madeira;

    public Mundo(String nomePersonagem, String tipoMadeira) {
        this.personagem = new Player("Steve",40,0,20);
        this.madeira = new Madeira(tipoMadeira);
    }

    public void iniciarJogo(){
        System.out.println("Jogo iniciado com sucesso!\n");
        personagem.entrarNoMundo();
        madeira.coletar();
    }
}
