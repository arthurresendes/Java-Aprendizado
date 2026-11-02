package aula01;

public abstract class Moto {
    protected String cilindadas;
    public  Moto(String cilindadas){
        this.cilindadas = cilindadas;
    }
    
    public abstract String freiar();
    public void parar(){
        System.out.println("Parando...");
    }
}
