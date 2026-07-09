import java.util.List;

public interface Metodos {
    void adicionarProduto(Produto produto);
    void removerProduto(String nome);
    Produto buscarProduto(String nome);
    double valorTotalEstoque();
    List<Produto> listarProdutosComEstoqueBaixo(int limite);
}

