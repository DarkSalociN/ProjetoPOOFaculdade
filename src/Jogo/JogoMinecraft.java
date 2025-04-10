package Jogo;

public class JogoMinecraft {
    private CriarPersonagem personagem;
    private Madeira madeira;

    public JogoMinecraft(String nomePersonagem, String tipoMadeira) {
        this.personagem = new CriarPersonagem(nomePersonagem);
        this.madeira = new Madeira(tipoMadeira);
    }

    public void iniciarJogo(){
        personagem.entrarNoMundo();
        madeira.coletar();
        System.out.println("Jogo iniciado com sucesso!");
    }
}
