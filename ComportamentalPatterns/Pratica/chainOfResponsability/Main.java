public class Main {
    public static void main(String[] args) {
        Mensagem n1 = new Nivel1();
        Mensagem n2 = new Nivel2();
        Mensagem gerente = new Gerente();

        n1.setProximo(n2);
        n2.setProximo(gerente);

        n1.aviso("complexo");
    }
}
