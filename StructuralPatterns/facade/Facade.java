package facade;

import java.util.ArrayList;
import java.util.List;

import facade.Worker.Action;

public class Facade{

	private final List<Worker> workers;
	
	public Facade() {
		workers= new ArrayList<Worker>();
		workers.add(new Minerador());
		workers.add(new BlackSmith());
	}
	
	public void startNewDay() {
		workers.forEach(w -> w.action(Action.WAKE_UP, 
				Action.GO_WORK        
				));
	}
	
	
	public void finishTheDay() {
		workers.forEach(w -> w.action(
				Action.GO_HOME
				,Action.GO_TO_SLEEP
				));
	}
	
	
}
