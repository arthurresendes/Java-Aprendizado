package SOLID.Single_Responsability;

public class SavePedido {
    public void salvar(Pedido pedido) {
        System.out.println("Salvando pedido do cliente: " + pedido.getCliente());
    }
}
