public class Main {
    public static void main(String[] args) {
        ProcessarService sistema = new ProcessarService();

        System.out.println("Iniciando Pedido 1");
        try {
            sistema.executarPedido("João Silva", "Book", 2);
        } catch (Exception e) {
            System.out.println("Erro no Pedido 1: " + e.getMessage());
        }

        System.out.println("\nIniciando Pedido 2 ");
        try {
            sistema.executarPedido("Maria Souza", "Pen", 0);
        } catch (Exception e) {
            System.out.println("Bloqueado pelo sistema: " + e.getMessage());
        }

        System.out.println("\nIniciando Pedido 3");
        try {
            sistema.executarPedido("Carlos Lima", "Pen", 10);
        } catch (Exception e) {
            System.out.println("Erro no Pedido 3: " + e.getMessage());
        }
    }
}