public class Main {

    public static void main(String[] args) {

        Canal canal = new Canal();

        Usuario u1 = new Usuario("Arthur");
        Usuario u2 = new Usuario("Carlos");

        canal.inscrever(u1);
        canal.inscrever(u2);

        canal.publicarVideo("Design Patterns");
    }
}