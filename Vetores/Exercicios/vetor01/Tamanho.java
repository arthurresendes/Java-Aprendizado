package Vetores.Exercicios.vetor01;
import java.util.Scanner;

public class Tamanho {
    public int getLength(Scanner sc){
        int number;
        System.out.println("Digite o tamanho do vetor de numeros: ");
        number = sc.nextInt();
        return number;
    }
}
