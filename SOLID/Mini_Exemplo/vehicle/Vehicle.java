public abstract class Vehicle {
    protected  String color;
    protected  String year;
    protected  double engine;
    protected  int seats;

    public Vehicle(String color, String year, double engine, int seats){
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }
}
