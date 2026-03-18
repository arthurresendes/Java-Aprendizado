package Loop.Exercicios.For;

import java.util.Scanner;

public class Loop {
    public int valorInteiro(){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(num < 2 || num > 1000){
            System.out.println("Digite um número inteiro entre 2 ate 1000: ");
            num = sc.nextInt();
        }
        sc.close();

        return num;
    }

    public void tabuada(){
        int numero = valorInteiro();
        for(int i = 1; i < 11; i++){
            System.out.println(numero + " x " + i + " = " + numero*i);
        }
    }
}
