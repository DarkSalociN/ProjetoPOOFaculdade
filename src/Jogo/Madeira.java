package Jogo;

public class Madeira {
    private String tipo;

    public Madeira(String tipo) {
        this.tipo = tipo;
    }

    public void coletar(){
        System.out.println("Coletando madeira do tipo:" + tipo);
    }
}
