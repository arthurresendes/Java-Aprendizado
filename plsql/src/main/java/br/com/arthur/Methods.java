package br.com.arthur;

import java.util.List;

public interface Methods {

    List<ProdutoImportadora> listarProdutos();

    Double calcularDesconto(Double preco);

    void cadastrarImportadora(String nome);
}