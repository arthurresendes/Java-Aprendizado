package bridge;

public class Circle extends Shape{
	public Circle(Color color) {
		super(color);
	}
	
	@Override
	public String draw() {
		return "Draws a circle " + color.fill();
	}
}
