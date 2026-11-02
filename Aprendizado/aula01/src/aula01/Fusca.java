package aula01;

public class Fusca implements Carro{

    //Sobrescrevendo oq vem da interface
    @Override
    public String acelerar() {
        return "Acelerando o Fusca";
    }

    @Override
    public String freiar() {
        return "Freiando o fusca";
    }

    @Override
    public void parar() {
        System.out.println("Parando carro..");
    }
}
