public class Main {
    public static void main(String[] args){
        Notify notificar = new Notify();
        System.out.println("Ola mundo");
        notificar.notifyClient();
        Check tipoVeiculo = new Check();
        tipoVeiculo.verificarTipo("CAR");
        tipoVeiculo.verificarTipo("MOTOCYCLE");
    }
}
