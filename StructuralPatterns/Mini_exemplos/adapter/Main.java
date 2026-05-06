public class Main {
    public static void main(String[] args) {
        PagamentoAntigo antigo = new PagamentoAntigo();
        App adp = new App(antigo);
        adp.pagar();
    }
}
