package Lista.SOLID;

import java.util.ArrayList;
import java.util.List;

public class LivroRepository {
    private List<Livro> livros = new ArrayList<>();

    public void adicionar(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> buscarTodos() {
        return livros;
    }

    public void salvarBanco(){
        System.out.println("Salvo no banco");
    }
}
