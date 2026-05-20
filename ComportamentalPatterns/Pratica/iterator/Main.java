public class Main {

    public static void main(String[] args) {

        Playlist playlist = new Playlist(5);

        playlist.adicionar(new Musica("Linkin Park"));
        playlist.adicionar(new Musica("Eminem"));
        playlist.adicionar(new Musica("Queen"));

        MeuIterator iterator = playlist.criarIterator();

        while(iterator.temProximo()){

            Musica musica = iterator.proximo();

            System.out.println(musica.getNome());
        }
    }
}