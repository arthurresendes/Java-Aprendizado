public class Cinema implements Sistema{
    @Override
    public void ligarLuz(){
        System.out.println("Ligando luz...");
    }
    @Override
    public void ligarProjetor(){
        System.out.println("Ligando Projetor...");
    }
    @Override
    public void ligarSom(){
        System.out.println("Ligando Som...");
    }

    public void assistirFilme(){
        ligarProjetor();
        ligarSom();
        ligarLuz();
    }


}
