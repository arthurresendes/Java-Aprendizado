public class Check {
    private static TypeVehicle typeVehicle;
    public void verificarTipo(String type){
        typeVehicle  = TypeVehicle.valueOf(type);
        if(typeVehicle == TypeVehicle.CAR){
            Car car = new Car("azul", "2009", 2.0, 4);
            car.criarCar();
        }else if(typeVehicle == TypeVehicle.MOTOCYCLE){
            Motocylce moto = new Motocylce("Branco","2009", 250, 1);
            moto.criarMoto();
        }
    }
}
