package chainofresponsability;

public abstract class Handler {
	private Handler next;

	public Handler(Handler next) {
		this.next = next;
	}

	public Handler getNext() {
		return next;
	}
	
	public abstract void execute(Currency cur);
	
	
}
