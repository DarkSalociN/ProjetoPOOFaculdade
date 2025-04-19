package Jogo;

public class Drops {
    private String tipo;

    public Drops(String tipo) {
        this.tipo = tipo;
    }

    public void coletar(){
        System.out.println("Coletando material:" + tipo);
    }
}
