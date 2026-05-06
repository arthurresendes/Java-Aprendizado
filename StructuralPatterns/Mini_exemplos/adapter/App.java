public class App implements Pagamento{
    private PagamentoAntigo sistemaAntigo;

    public App(PagamentoAntigo sistemaAntigo) {
        this.sistemaAntigo = sistemaAntigo;
    }

    @Override
    public void pagar(){
        this.sistemaAntigo.realizarPagamento();;
    }
    
}