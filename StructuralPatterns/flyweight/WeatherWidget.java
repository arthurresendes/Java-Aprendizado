package flyweight;

public class WeatherWidget extends Widget{

	public WeatherWidget() {
		super("weather", "code to create a weather widget");
	}

	@Override
	public void draw(String color, String position) {
		System.out.printf("Drawing a %s with %s in %s \n", getName(), color, position);
	}	
}
