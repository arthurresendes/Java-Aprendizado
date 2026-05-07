package facade;

public class Minerador extends Worker {

	@Override
	public String name() {
		return "Miner";
	}

	@Override
	public String work() {
		return name() + " works digging to find metal...";
	}

}
