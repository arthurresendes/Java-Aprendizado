package bridge;

public class App {
	public static void main(String args[]) {
		Shape rc = new Circle(new Red());
		System.out.println(rc.draw());
		
		Shape bc = new Circle(new Blue());
		System.out.println(bc.draw());
		
		Shape bs = new Square(new Blue());
		System.out.println(bs.draw());
		
		
	}
}
