public class Ninja{
    private String nome;
    private int idade;

    public Ninja(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void ataqueBasico(){
        System.out.println("Joguei uma Kunai");
    }
}