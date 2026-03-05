package SOLID.Single_Responsability;

public class InfoPedido {
    public void imprimir(Pedido pedido, double valorFinal) {
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Valor original: " + pedido.getValor());
        System.out.println("Valor final com desconto: " + valorFinal);
    }
}
