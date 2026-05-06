public class ControleRemoto {
    protected Dispositivo dispositivo;

    public ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void botaolLigar(){
        dispositivo.ligar();
    }

    public void irParaCanal(int canal){
        dispositivo.mudarCanal(canal);
    }

    public void botaoDesligar(){
        dispositivo.desligar();
    }
}
