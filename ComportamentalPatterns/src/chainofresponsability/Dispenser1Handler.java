package chainofresponsability;

public class Dispenser1Handler extends Handler {

	public Dispenser1Handler(Handler next) {
		super(next);
	}

	@Override
	public void execute(Currency cur) {
		if(cur.getAmount() >= 1) {
			int num =  cur.getAmount() / 1;
			System.out.printf("Dispensing " + num + " of $1\n");
			int reminder = cur.getAmount() % 1;
			
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
