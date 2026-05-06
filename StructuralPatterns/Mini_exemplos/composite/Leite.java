public class Leite extends CafeDecorator {
    public Leite(Cafe cafe) { super(cafe); }

    @Override
    public String getDescricao() { return cafeDecorado.getDescricao() + ", Leite"; }
    @Override
    public double getPreco() { return cafeDecorado.getPreco() + 1.50; }
}
