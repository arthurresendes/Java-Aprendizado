public class TV implements Dispositivo {
    @Override
    public void ligar() { System.out.println("TV Ligada."); }
    @Override
    public void desligar() { System.out.println("TV Desligada."); }
    @Override
    public void mudarCanal(int canal) { System.out.println("TV no canal: " + canal); }
}