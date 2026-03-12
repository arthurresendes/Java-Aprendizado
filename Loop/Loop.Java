import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		int incrementando = 1, num = 1;
		while(incrementando < 11) {
			System.out.println("Numero: " + incrementando);
			incrementando++;
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero de 1 até 10 para ver sua tabuada...");
		do {
			num = sc.nextInt();
			for(int i = 1; i < 11; i++) {
				System.out.println(num + " * "+ i + " = " + num * i);
			}
		}while(num > 10 || num < 1);
	sc.close();	
	}

}
