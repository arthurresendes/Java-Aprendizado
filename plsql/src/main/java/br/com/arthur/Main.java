package br.com.arthur;

public class Main {

    public static void main(String[] args) {

        ProdutoDAOImpl dao = new ProdutoDAOImpl();

        System.out.println("===== VIEW =====");

        for (ProdutoImportadora p : dao.listarProdutos()) {
            System.out.println(p);
        }

        System.out.println();

        System.out.println("===== PROCEDURE =====");

        dao.cadastrarImportadora("Fanta");
        System.out.println();

        dao.cadastrarProd("Fanta Uva", 9.99, 50, true, 4);
        System.out.println();

        System.out.println("===== FUNCTION =====");

        Double desconto = dao.calcularDesconto(100.00);

        System.out.println("Preço original: R$100.00");
        System.out.println("Preço com desconto: R$" + desconto);
    }
}