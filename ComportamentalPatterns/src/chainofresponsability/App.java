package chainofresponsability;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//Handler h1 = new Dispenser1Handler(null);
		//Handler h20 = new Dispenser20Handler(h1);
		//Handler h50 = new Dispenser50Handler(h20);
		//h50.execute(new Currency(136));

		Handler first = getChain();
		Scanner sc = new Scanner(System.in);
		int amount = 0;
		do {
			System.out.println("Enter an amount or 0 to exit: ");
			amount = sc.nextInt();
			if(amount > 0) first.execute(new Currency(amount));
		}while(amount > 0);
		sc.close();
		
	}

	private static Handler getChain() {
		return new Dispenser50Handler(new Dispenser20Handler(new Dispenser1Handler(null)));
	}

}
