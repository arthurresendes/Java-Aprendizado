public class Saida {
    public static void main(String[] args) {
        String nome = "Arthur";
        int idade = 19;
        double salario = 9999.99;

        System.out.println(nome + " tem " + idade + " anos e com o salario de RS " + salario + " reais");

        // Usamos printf quando especificamos com % os casos
        System.out.printf("%s tem %d anos e com o salario de RS %.2f reais %n", nome, idade, salario);
    }
}
