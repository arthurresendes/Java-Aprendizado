package facade;

import java.util.Arrays;

public abstract class Worker {
	public abstract String name();
	public abstract String work();
	
	enum Action{
		GO_TO_SLEEP, WAKE_UP, GO_WORK, GO_HOME
	}
	
	public void action(Action action) {
		switch(action) {
		case GO_TO_SLEEP -> goToSleep();
		case WAKE_UP -> wakeUp();
		case GO_WORK -> System.out.println(work());
		case GO_HOME -> goToHome();
		default -> System.out.println("Undefined action");
		}
	}
	
	// Lista de actions que não sabe quantas são
	public void action(Action ...actions) {
		Arrays.stream(actions).forEach(this::action);
	}
	
	private void goToHome() {
		System.out.println(name() + " goes to home.");
	}
	
	private void wakeUp() {
		System.out.println(name() + " wake up.");
	}
	
	private void goToSleep() {
		System.out.println(name() + " goes to sleep.");
	}
}
