package Vetores;

public class Basico {
    public static void main(String[] args) {
        int A[] = new int[10];
        double[] B = new double[5];
        int i;

        for(i = 0; i < 10; i++) {
            A[i] = i;
        }

        for(i = 0; i < 5; i++) {
            B[i] = i + 10;
        }

        for(i = 0; i < 10; i++) {
            System.out.println("Vetor A na posição " + i + ": " + A[i]);
        }
    }
}
