import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        estoque.adicionarProduto(new Produto("Notebook", 3, 3500.00));
        estoque.adicionarProduto(new Produto("Mouse", 15, 50.00));
        estoque.adicionarProduto(new Produto("Teclado", 8, 120.00));
        estoque.adicionarProduto(new Produto("Monitor", 2, 900.00));
        estoque.adicionarProduto(new Produto("Cabo HDMI", 20, 25.00));

        System.out.println("Valor total do estoque: R$ " + estoque.valorTotalEstoque());

        System.out.println("\nProdutos com estoque baixo (< 5 unidades):");
        List<Produto> estoqueBaixo = estoque.listarProdutosComEstoqueBaixo(5);
        for (Produto p : estoqueBaixo) {
            System.out.println("- " + p.getName() + " (qtd: " + p.getQtd() + ")");
        }

        System.out.println("\nBuscando 'Mouse':");
        Produto encontrado = estoque.buscarProduto("Mouse");
        System.out.println(encontrado != null ? encontrado.getName() + " - R$ " + encontrado.getPrice() : "Não encontrado");

        estoque.removerProduto("Monitor");
        System.out.println("\nApós remover 'Monitor':");
        Produto removido = estoque.buscarProduto("Monitor");
        System.out.println(removido != null ? removido.getName() : "Monitor não está mais no estoque");

        System.out.println("\nValor total do estoque após remoção: R$ " + estoque.valorTotalEstoque());
    }
}