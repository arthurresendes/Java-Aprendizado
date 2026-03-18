package Vetores.Exercicios.vetor01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Tamanho num = new Tamanho();
        int n = num.getLength(sc);

        Vetor vt = new Vetor();
        double[] array = new double[n];
        vt.setNumbers(sc,array, n);
        vt.getNumbers(array, n);
        sc.close();
    }
}
