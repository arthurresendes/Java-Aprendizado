public class Radio implements Dispositivo {
    @Override
    public void ligar() { System.out.println("Rádio Ligado."); }
    @Override
    public void desligar() { System.out.println("Rádio Desligado."); }
    @Override
    public void mudarCanal(int canal) { System.out.println("Rádio na frequência: " + canal + " FM"); }
}