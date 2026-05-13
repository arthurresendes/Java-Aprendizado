public class adapter implements ligarTV,desligarTV {
    @Override
    public void ligarTelevisao(){
        System.out.println("Ligando tv");
    }

    @Override
    public void desligarTelevisao(){
        System.out.println("Desligando tv");
    }
}
