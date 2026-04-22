public class Motocylce extends Vehicle{
    public Motocylce(String color, String year, double engine, int seats) {
        super(color, year, engine, seats);
    }
    void criarMoto(){
        System.out.println("Criando uma moto: " + color + " " + " " + year + " " + engine + " " + seats);
    }

}
