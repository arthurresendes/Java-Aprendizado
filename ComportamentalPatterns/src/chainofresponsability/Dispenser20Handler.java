package chainofresponsability;

public class Dispenser20Handler extends Handler {

	public Dispenser20Handler(Handler next) {
		super(next);
	}

	@Override
	public void execute(Currency cur) {
		if(cur.getAmount() >= 20) {
			int num =  cur.getAmount() / 20;
			System.out.printf("Dispensing " + num + " of $20\n");
			int reminder = cur.getAmount() % 20;
			
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
