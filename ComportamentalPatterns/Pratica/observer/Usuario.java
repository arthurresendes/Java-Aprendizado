public class Usuario implements Inscrito {

    private String nome;

    public Usuario(String nome){
        this.nome = nome;
    }

    @Override
    public void atualizar(String video){
        System.out.println(nome + " recebeu notificação: " + video);
    }
}