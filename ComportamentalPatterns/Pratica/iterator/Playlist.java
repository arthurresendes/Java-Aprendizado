public class Playlist {

    private Musica[] musicas;
    private int quantidade = 0;

    public Playlist(int tamanho){
        musicas = new Musica[tamanho];
    }

    public void adicionar(Musica musica){
        musicas[quantidade] = musica;
        quantidade++;
    }

    public MeuIterator criarIterator(){
        return new PlaylistIterator(musicas, quantidade);
    }
}