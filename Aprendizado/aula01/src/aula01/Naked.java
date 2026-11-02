package aula01;

public class Naked extends Moto{
    public Naked(){
        super("600cc");
    }
    @Override
    public String freiar() {
        return "Freiando Naked que tem " + this.cilindadas;
    }

    @Override
    public void parar(){
        System.out.println("Parando Naked");
    }
}
