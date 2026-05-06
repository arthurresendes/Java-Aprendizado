public class Main {
    public static void main(String[] args) {
        Cafe meuCafe = new CafeSimples();
        
        meuCafe = new Leite(meuCafe);
        
        meuCafe = new Chocolate(meuCafe);
        
        System.out.println("Pedido: " + meuCafe.getDescricao());
        System.out.println("Total: R$ " + meuCafe.getPreco());
    }
}
