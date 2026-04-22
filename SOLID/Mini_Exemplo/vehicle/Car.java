public class Car extends Vehicle{
    public Car(String color, String year, double engine, int seats) {
        super(color, year, engine, seats);
    }

    void criarCar(){
        System.out.println("Criando um carro: " + color + " " + " " + year + " " + engine + " " + seats);
    }

    void startVehicle(){
        System.out.println("Iniciando veiculo");
    }
}
