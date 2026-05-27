public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new Pix();
        Loja loja = new Loja(pagamento);
        loja.finalizarCompra();
    }
}