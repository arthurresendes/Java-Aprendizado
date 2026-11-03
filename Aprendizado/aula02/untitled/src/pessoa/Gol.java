package pessoa;

import carro.Carro;

public class Gol extends Carro {
    public Gol(String modelo, String cor, int ano, String placa) {
        super(modelo, cor, ano, placa);
    }

    @Override
    public void ligar(){
        System.out.println("Gol ligando");
    }

    @Override
    public void desligar(){
        System.out.println("Gol desligando");
    }
}
