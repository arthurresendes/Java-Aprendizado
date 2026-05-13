public class Gerente implements Mensagem {

    private Mensagem proximo;

    @Override
    public void setProximo(Mensagem proximo) {
        this.proximo = proximo;
    }

    @Override
    public void aviso(String problema) {
        System.out.println("Gerente resolveu problema complexo");
    }
}