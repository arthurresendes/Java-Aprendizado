package abstractfactory;

public class App {

	public static void main(String[] args) {
		String type = args[0];
		playWith(type);

	}

	private static void playWith(String type) {
		
		KingdomFactory factory = KingdomFactory.getInstance(type);
		
		createKingdom(factory);
	}

	private static void createKingdom(KingdomFactory factory) {
		Army army = factory.createArmy();
		Castle castle = factory.createCastle();
		King king = factory.createKing();
		
		System.out.println(army.getClass().getSimpleName());
		System.out.println(castle.getClass().getSimpleName());
		System.out.println(king.getClass().getSimpleName());
	}

}
