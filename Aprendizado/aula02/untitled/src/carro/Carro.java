package carro;

public class Carro {
    protected String modelo;
    String cor;
    int ano;
    String placa;

    public Carro(String modelo, String cor, int ano, String placa){
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
    }

    public void ligar(){
        System.out.println("Ligando " + this.modelo);
    }

    public void desligar(){
        System.out.println("Desligando " + this.modelo);
    }

    public void teste(){
        System.out.println("Teste");
    }
}
