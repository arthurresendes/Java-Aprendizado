package Single_Responsability;
public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Arthur", 1500);

        PedidoService service = new PedidoService();
        SavePedido repository = new SavePedido();
        InfoPedido printer = new InfoPedido();
        pedido.setValor("Arthur", 1800.20);

        double valorFinal = service.calcularValorFinal(pedido);

        repository.salvar(pedido);
        printer.imprimir(pedido, valorFinal);
    }
}
