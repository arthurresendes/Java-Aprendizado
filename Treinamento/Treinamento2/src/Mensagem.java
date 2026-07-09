public class Mensagem implements  Informacoes{
    @Override
    public String retonarMensagem(Pessoa p){

        return "Olá " + p.getNome() + " você tem " + p.getIdade() + " anos";
    }
}
