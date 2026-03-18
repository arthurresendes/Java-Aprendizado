package Matrizes.Exercicios.matriz01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Matriz mt = new Matriz();
        double[][] A;

        Scanner sc = new Scanner(System.in);
        int linhas = mt.setGetLinha(sc);
        int colunas = mt.setGetColuna(sc);

        A = new double[linhas][colunas];
        mt.setValues(A, linhas, colunas, sc);
        mt.getValues(A, linhas, colunas, sc);

        sc.close();
    }
}
