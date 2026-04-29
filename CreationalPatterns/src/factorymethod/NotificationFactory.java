package factorymethod;

import factorymethod.Notification.Type;

public class NotificationFactory {
	/**
	 * Este é um metodo responsavel por abstrair e retornar os tipos de notificações de acordo com seu type
	 * @param type Tipo d notificação (SMS, EMAIL E PUSH)
	 * @return Retorna as devidas notificações
	 */
	public static Notification create(Type type) {
		switch (type) {
		case SMS: return new SMSNotification();
		case EMAIL: return new EmailNotification();
		case PUSH: return new PushNotifications();
		default: throw new IllegalArgumentException("Unknown notification type");
		}
}
}
