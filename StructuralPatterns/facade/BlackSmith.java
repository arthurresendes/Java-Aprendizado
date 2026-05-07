package facade;

public class BlackSmith extends Worker {

	@Override
	public String name() {
		return "Blacksmith";
	}

	@Override
	public String work() {
		return name() + " works creating tools...";
	}

}
