public class Loja {

    private Pagamento pagamento;

    public Loja(Pagamento pagamento){
        this.pagamento = pagamento;
    }

    public void finalizarCompra(){
        pagamento.pagar();
    }
}