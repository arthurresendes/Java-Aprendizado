package Lista.SOLID;

public class Main {
    public static void main(String[] args) {
        LivroRepository repo = new LivroRepository();
        RelatorioService relatorio = new RelatorioService();

        repo.adicionar(new Livro("Clean Code", 100.0f, "VIP"));
        repo.salvarBanco();
        repo.adicionar(new Livro("Design Patterns", 150.0f, "Normal"));
        repo.salvarBanco();

        
        relatorio.imprimir(repo.buscarTodos());

        Desconto descontos = new DescontoVIP();
        float precoComDesconto = descontos.aplicar(100.0f);
        
        System.out.println("Preço VIP para Clean Code: " + precoComDesconto);
    }
}
