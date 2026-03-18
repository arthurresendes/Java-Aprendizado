package Loop.Exercicios.While;

import java.util.Scanner;

public class Loop {
    public void varredura(){
        Scanner sc = new Scanner(System.in);
        int n1 = 0,n2 = 1;
        while(n1 != n2){
            System.out.println("Digite o primeiro valor: ");
            n1 = sc.nextInt();
            System.out.println("Digite o segundo valor: ");
            n2 = sc.nextInt();
            
            if(n1 > n2){
                System.out.println(n1 + " " +  n2 +" Decrescente");
            }else if(n1 < n2){
                System.out.println(n1 + " " +  n2 +" Crescente");
            }else{
                System.out.println(n1 + " " +  n2 +" Iguais");
            }
        }

        sc.close();
    }
}
