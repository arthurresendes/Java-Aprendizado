public class Pessoa implements  Informacoes{
    private final String nome;
    private final int idade;

    public Pessoa(String nome, int atual,int nascimento){
        this.nome = nome;
        this.idade = atual - nascimento;
    }

    @Override
    public String retonarMensagem(){
        return "Olá " + nome + " você tem " + idade + " anos";
    }
}
