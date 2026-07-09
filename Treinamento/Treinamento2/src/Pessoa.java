public class Pessoa{
    private final String nome;
    private final int idade;

    public Pessoa(String nome, int atual,int nascimento){
        this.nome = nome;
        this.idade = atual - nascimento;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
