public class Nivel2 implements Mensagem{
    private Mensagem proximo;

    @Override
    public void setProximo(Mensagem proximo) {
        this.proximo = proximo;
    }
    @Override
    public void aviso(String problema){
        if(problema.equals("medio")){
            System.out.println("Passando pelo nivel2");
        }
        if(proximo != null){
                proximo.aviso(problema);
        }
    }
}
