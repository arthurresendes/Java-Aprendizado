package command;

public class SellCommand implements Command{

	private StockReceiver receiver;
	public SellCommand(StockReceiver receiver) {
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		receiver.sell();
	}
	
}
