public class Main {
    public static void main(String[] args) {
        int idade = 32;
        String nome = "Arthur";

        nome = nome.toUpperCase();
        System.out.println(idade);
        mostrarNome(nome, 19);

        for (int i = 1; i < 11; i++) {
            mostrarNome(nome, i);
        }

        Ninja naruto = new Ninja("Naruto", 30);
        //naruto.setNome("Naruto");
        //naruto.setIdade(30);
        naruto.ataqueBasico();


        Uchiha ninja = new Uchiha("Madara", 2000);

        ninja.sharinganAtivado();
        ninja.ataqueBasico();
        ninja.ataqueBasico(5);
        ninja.ataqueBasico(0);
        ninja.ataqueBasico(1);
        System.out.println(ninja.getNome() + " - " + ninja.getIdade());

    }

    private static void mostrarNome(String nome, int idade) {
        System.out.println("Meu nome é " + nome + " tenho " + idade + " anos");
    }
}