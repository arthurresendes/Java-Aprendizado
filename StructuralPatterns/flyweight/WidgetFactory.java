package flyweight;

import java.util.HashMap;
import java.util.Map;

public class WidgetFactory {
	private static Map<String, Widget> pool = new HashMap<>();
	
	public static Widget getWidget(String name) {
		if(!pool.containsKey(name)) {
			pool.put(name, factory(name));
		}
		
		return pool.get(name);
	}

	private static Widget factory(String name) {
			return switch(name) {
			case "clock" -> new ClockWidget();
			case "weather" -> new WeatherWidget();
			default -> throw new IllegalArgumentException("Unexpected value");
		};
	}
}
