public class Chocolate extends CafeDecorator {
    public Chocolate(Cafe cafe) { super(cafe); }

    @Override
    public String getDescricao() { return cafeDecorado.getDescricao() + ", Chocolate"; }
    @Override
    public double getPreco() { return cafeDecorado.getPreco() + 2.00; }
}
