public class PlaylistIterator implements MeuIterator {

    private Musica[] musicas;
    private int posicao = 0;
    private int tamanho;

    public PlaylistIterator(Musica[] musicas, int tamanho){
        this.musicas = musicas;
        this.tamanho = tamanho;
    }

    @Override
    public boolean temProximo(){
        return posicao < tamanho;
    }

    @Override
    public Musica proximo(){
        Musica musica = musicas[posicao];
        posicao++;
        return musica;
    }
}