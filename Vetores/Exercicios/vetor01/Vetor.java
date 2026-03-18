package Vetores.Exercicios.vetor01;

import java.util.Scanner;

public class Vetor {
    public void setNumbers(Scanner sc, double[] vetor,int tamanho){
        for(int i = 0; i < tamanho; i++){
            System.out.println("Digite o valor na posicao: " + i);
            vetor[i] = sc.nextDouble();
        }

    }

    public void getNumbers(double[] vetor, int tamanho){
        for(int i = 0; i < tamanho; i++){
            System.out.println("[ " + i + " ] : " + vetor[i]);
        }
    }


}
