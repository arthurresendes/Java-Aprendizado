public class App implements Jogo{
    @Override
    public void baixarImagem(){
        try {
            Thread.sleep(3000); 
            System.out.println("Imagem baixada");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("O download foi interrompido.");
        }
    }

    @Override
    public void jogar(){
        System.out.println("Iniciando o jogo....");
    }
}
