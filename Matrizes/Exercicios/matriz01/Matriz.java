package Matrizes.Exercicios.matriz01;
import java.util.Scanner;

public class Matriz {
    public int setGetLinha(Scanner sc){
        int num;
        System.out.println("Digite o numero de linhas: ");
        num = sc.nextInt();
        return num;
    }

    public int setGetColuna(Scanner sc){
        int num;
        System.out.println("Digite o numero de linhas: ");
        num = sc.nextInt();
        return num;
    }

    public void setValues(double[][] A,int linhas, int colunas, Scanner sc){
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.println("Digite o valor da linha " + i + " coluna " + j + " :");
                A[i][j] =  sc.nextDouble();
            }
        }
    }

    public void getValues(double[][] A,int linhas, int colunas, Scanner sc){
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
