package Lista.SOLID;

import java.util.List;

public class RelatorioService {

    public void imprimir(List<Livro> lista) {
            lista.forEach(System.out::println);
    }
}
