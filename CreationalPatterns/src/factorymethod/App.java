package factorymethod;

import factorymethod.Notification.Type;

public class App {
	public static void main(String[] args) {
		Notification n = NotificationFactory.create(Type.SMS);
		n.notifyUser();
	}
}
