package Exercicios;

import java.util.Scanner;

public class Exercicios01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura;
        double largura;
        double valorMetro;

        System.out.println("Qual altura do terreno: ");
        altura = sc.nextDouble();

        System.out.println("Qual largura do terreno: ");
        largura = sc.nextDouble();

        System.out.println("Qual preço por metro quadrado do terreno: ");
        valorMetro = sc.nextDouble();

        double area = altura * largura;
        double valorTotal = valorMetro * area;

        System.out.printf("Área do terreno %.2f%nPreço total: %.2f%n", area, valorTotal);

        // -------------------------------------------------------------------------------

        int x;
        int y;

        System.out.println("Qual valor de x: ");
        x = sc.nextInt();

        System.out.println("Qual valor de y: ");
        y = sc.nextInt();

        System.out.printf("Soma dos elementos: %d%n", x + y);

        // -------------------------------------------------------------------------------

        String nome1, nome2;
        int idade1, idade2;

        System.out.println("Qual nome da 1 pessoa: ");
        nome1 = sc.next();

        System.out.println("Qual idade da 1 pessoa: ");
        idade1 = sc.nextInt();

        System.out.println("Qual nome da 2 pessoa: ");
        nome2 = sc.next();

        System.out.println("Qual idade da 2 pessoa: ");
        idade2 = sc.nextInt();

        double media = (idade1 + idade2) / 2.0;
        System.out.printf("A idade media de %s e %s eh de %.2f %n", nome1, nome2, media);

        sc.close();

    }
}
