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
            return "Titulo " + titulo + ", Autor: " + autor + ", Disponivel: " + disponivel;
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
            System.out.println("Livro emprestado com sucesso!");
            livro.setDisponivel();
        } else {
            System.out.println("Erro: Este livro não existe na biblioteca.");
        }
    }
    public void listarLivros(){
        if(listaLivros.isEmpty()){
            System.out.println("Sem livros na biblioteca!");
        }else{
            for(Livro l: listaLivros){
                System.out.println("Livro: " + l.verInfo());
            }
        }
    }
}

public class Bibliotev {
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca();
        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro l2 = new Livro("1984", "George Orwell");
        Livro l3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
        
        biblio.adicionarLivro(l1);
        biblio.listarLivros();
        biblio.emprestarLivro(l1);

        biblio.adicionarLivro(l2);
        biblio.listarLivros();
        biblio.emprestarLivro(l2);

        biblio.adicionarLivro(l3);
        biblio.listarLivros();

        biblio.removerLivro(l1);
        biblio.removerLivro(l2);
        biblio.removerLivro(l3);

        biblio.listarLivros();
    }
}
