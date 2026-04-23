public class Main {
    public static void main(String[] args){
        System.out.println("Ola mundo");


        Notify notificar = new Notify();
        notificar.notifyClient();

        Check tipoVeiculo = new Check();
        tipoVeiculo.verificarTipo("CAR");
        tipoVeiculo.verificarTipo("MOTOCYCLE");


        Computador cp = new Computador();
        cp.temWindows();
        cp.temArmazenamentoPesado();

        Celular cl = new Celular();
        cl.temBiometria();
    }
}
