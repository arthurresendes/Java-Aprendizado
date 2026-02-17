import java.util.Scanner;

public class contador {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para printar até ele: ");
        int num = scanner.nextInt();
        int contador = 1;
        while(contador <= num){
            System.out.println(contador);
            contador++;
        }


        scanner.close();
    }
}
