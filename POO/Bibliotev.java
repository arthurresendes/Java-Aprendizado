import java.util.ArrayList;

class Livro{
        private String titulo;
        private String autor;
        private Boolean disponivel;

        public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; 
        }

        public String verInfo(){
            return "Titulo " + titulo + " Autor: " + autor + " Disponivel: " + disponivel;
        }

        public void setDisponivel(){
            disponivel = false;
        }

}

class Biblioteca{
    private ArrayList<Livro> listaLivros = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        listaLivros.add(livro);
    }

    public void removerLivro(Livro livro){
        if (listaLivros.remove(livro)) {
            System.out.println("Livro removido com sucesso!");
        } else {
            System.out.println("Erro: Este livro não existe na biblioteca.");
        }
    }

    public void emprestarLivro(Livro livro){
        if (listaLivros.contains(livro)) {
            System.out.println("Livro emprestadi com sucesso!");
            livro.setDisponivel();
        } else {
            System.out.println("Erro: Este livro não existe na biblioteca.");
        }
    }
    public void listarLivros(){
        for(Livro l: listaLivros){
            System.out.println("Livro: " + l.verInfo());
        }
    }
}

public class Bibliotev {
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca();
        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis");
        
        biblio.adicionarLivro(l1);
        biblio.listarLivros();
        
        biblio.emprestarLivro(l1);
        biblio.listarLivros();
    }
}
