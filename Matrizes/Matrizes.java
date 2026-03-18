package Matrizes;

public class Matrizes {
    public static void main(String[] args) {
        int LINHAS = 3;
        int COLUNAS = 4;
        double[][] A = new double[LINHAS][COLUNAS];

        for(int i = 0; i < LINHAS; i++){
            for(int j = 0; j < COLUNAS; j++){
                A[i][j] = i;
            }
        }
        for(int i = 0; i < LINHAS; i++){
            for(int j = 0; j < COLUNAS; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
