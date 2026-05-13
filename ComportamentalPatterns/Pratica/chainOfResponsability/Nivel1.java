public class Nivel1 implements Mensagem{
    private Mensagem proximo;

    @Override
    public void setProximo(Mensagem proximo) {
        this.proximo = proximo;
    }

    @Override
    public void aviso(String problema){
        if(problema.equals("simples")){
            System.out.println("Passando pelo nivel1");
        }
        if(proximo != null){
                proximo.aviso(problema);
        }
    }
}
