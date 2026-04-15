package singleton;

public class App {

	public static void main(String[] args) {
		Database d1 = Database.getInstance();
		Database d2 = Database.getInstance();
		Database d3 = Database.getInstance();
		Database d4 = Database.getInstance();
		Database d5 = Database.getInstance();
		
		System.out.println("Qtd objetos: " + Database.counter);

	}

}
