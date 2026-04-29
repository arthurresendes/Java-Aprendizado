package factorymethod;

public class PushNotifications implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending a push notification to user ...");
	}

}
