import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, nomeCompleto;
        int idade;
        double salario;
        char letraPreferidade;

        System.out.println("Digite seu nome completo: ");
        nomeCompleto = sc.nextLine();
        System.out.println(nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        nome = sc.next();
        System.out.println(nome);

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println(idade);

        System.out.println("Digite seu salario: ");
        salario = sc.nextDouble();
        System.out.printf("%.2f%n", salario);

        System.out.println("Digite sua letra favorita: ");
        letraPreferidade = sc.next().charAt(0);
        System.out.println(letraPreferidade);

        sc.close();

    }
}
