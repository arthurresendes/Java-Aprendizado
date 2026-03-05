package SOLID.Single_Responsability;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Arthur", 1500);

        PedidoService service = new PedidoService();
        SavePedido repository = new SavePedido();
        InfoPedido printer = new InfoPedido();

        double valorFinal = service.calcularValorFinal(pedido);

        repository.salvar(pedido);
        printer.imprimir(pedido, valorFinal);
    }
}
