package chainofresponsability;

public class Dispenser50Handler extends Handler {

	public Dispenser50Handler(Handler next) {
		super(next);
	}

	@Override
	public void execute(Currency cur) {
		if(cur.getAmount() >= 50) {
			int num =  cur.getAmount() / 50;
			System.out.printf("Dispensing " + num + " of $50\n");
			int reminder = cur.getAmount() % 50;
			
			if(getNext() != null) {
				getNext().execute(new Currency(reminder));
			}
		}else {
			if(getNext() != null) {
				getNext().execute(cur);
			}
		}
	}

}
