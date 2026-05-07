package flyweight;

public class App {

	public static void main(String[] args) {
		Widget clock = WidgetFactory.getWidget("clock");
		Widget clock2 = WidgetFactory.getWidget("clock");
		
		if(clock == clock2) {
			System.out.println("Mesmo objeto");
		}
		
		clock.draw("Blue", "Left");
		clock.draw("Red", "Center");
		clock.draw("Green", "Top");
		clock.draw("Blue", "Right");
		
		Widget weather = WidgetFactory.getWidget("weather");
		weather.draw("cian", "bottom");

	}

}
