package command;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Thread t = new Thread(new InvokeWorker());
		t.start();
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		do {
			System.out.println("Submit a request or 0 to exit:");
			String req = sc.nextLine();
			exit = "0".equals(req);
			if(!exit) {
				Command cmd = actionFactory(req);
				InvokerQueue.add(cmd);	
			}
		}while(!exit);
		sc.close();
		System.exit(0);
	}

	private static Command actionFactory(String req) {
		String[] split = req.split(";");
		String action = split[0]; 
		String ticker = split[1]; 
		Integer qtd = Integer.parseInt(split[2]);
		Double price = Double.parseDouble(split[3]);
		return switch (action) {
		
		case "buy" -> new BuyCommand(new StockReceiver(ticker, qtd, price));
		case "sell" -> new SellCommand(new StockReceiver(ticker, qtd, price));
		case "rent" -> new RentCommand(new StockReceiver(ticker, qtd, price));
		default -> throw new IllegalArgumentException("Unkdown action");
		};
	}
}
