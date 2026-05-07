package flyweight;

public class ClockWidget extends Widget{

	public ClockWidget() {
		super("clock", "code to create a clock widget");
	}

	@Override
	public void draw(String color, String position) {
		System.out.printf("Drawing a %s with %s in %s \n", getName(), color, position);
	}
	
	
	

}
