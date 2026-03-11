package Condicionais.Se;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double nota1,nota2,media;

        System.out.println("Digite a nota 1: ");
        nota1 = sc.nextDouble();

        System.out.println("Digite a nota 2: ");
        nota2 = sc.nextDouble();

        media = (nota1+nota2)/2.0;
        if(media > 6.0){
            System.out.println("Parabens voce passou com: " + media);
        }else{
            System.out.println("Reprovado!!!!");
        }


        sc.close();
    }
}
