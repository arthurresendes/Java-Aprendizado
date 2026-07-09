import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Estoque implements Metodos {
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public void removerProduto(String nome) {
        produtos.removeIf(p -> p.getName().equals(nome));
    }

    @Override
    public Produto buscarProduto(String nome) {
        return produtos.stream().filter(p -> p.getName().equals(nome)).findFirst().orElse(null);
    }

    @Override
    public double valorTotalEstoque() {
        return produtos.stream()
                .mapToDouble(p -> p.getPrice() * p.getQtd()).sum();
    }

    @Override
    public List<Produto> listarProdutosComEstoqueBaixo(int limite) {
        return produtos.stream()
                .filter(p -> p.getQtd() < limite)
                .collect(Collectors.toList());
    }

}
