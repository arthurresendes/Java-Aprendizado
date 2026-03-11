package Condicionais.Se;

import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y,z;

        System.out.println("Qual valor de x: ");
        x = sc.nextInt();

        System.out.println("Qual valor de y: ");
        y = sc.nextInt();

        System.out.println("Qual valor de y: ");
        z = sc.nextInt();

        if(x < y && x < z){
            System.out.println("X eh o menor");
        }else if(y < x && y < z){
            System.out.println("Y eh o menor");
        }else{
            System.out.println("Z eh o menor");
        }

        sc.close();

    }
}
