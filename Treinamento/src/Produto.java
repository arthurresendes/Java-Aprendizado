public class Produto {
    private String name;
    private int qtd;
    private double price;

    public Produto(String name, int qtd, double price){
        this.name = name;
        this.qtd = qtd;
        this.price = price;
    }

    public String getName() {
        return name;
    }
}
