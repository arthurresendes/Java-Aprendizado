package abstractfactory;

public class ElfKingdom implements KingdomFactory {

	@Override
	public King createKing() {
		// TODO Auto-generated method stub
		return new ElfKing();
	}

	@Override
	public Castle createCastle() {
		// TODO Auto-generated method stub
		return new ElfCatsle();
	}

	@Override
	public Army createArmy() {
		// TODO Auto-generated method stub
		return new ElfArmy();
	}

}
