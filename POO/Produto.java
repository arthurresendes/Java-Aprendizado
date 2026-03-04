public class Produto {
    private String nome;
    private Float preco;
    private Integer quantidade;

    public Produto(String nome, Float preco, Integer quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
    }

    public Float valorTotal(){
        return preco * quantidade;
    }

    public String exibirDados(){
        return "Nome: " + nome + " Preço: " + preco + " Quantidade: " + quantidade;
    }
    public static void main(String[] args) {
        Produto prod = new Produto("Cafe", 20.20f, 10);

        System.out.println(prod.valorTotal());
        System.out.println(prod.exibirDados());
    }
}
