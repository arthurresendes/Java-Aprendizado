package SOLID.Single_Responsability;

public class PedidoService {
    public double calcularDesconto(Pedido pedido) {
        if (pedido.getValor() > 1000) {
            return pedido.getValor() * 0.1;
        }
        return 0;
    }

    public double calcularValorFinal(Pedido pedido) {
        return pedido.getValor() - calcularDesconto(pedido);
    }
}
