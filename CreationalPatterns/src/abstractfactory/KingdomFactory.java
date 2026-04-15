package abstractfactory;

import java.lang.reflect.InvocationTargetException;

public interface KingdomFactory {
	public King createKing();
	public Castle createCastle();
	public Army createArmy();
	
	public static KingdomFactory getInstance(String type) {
		// type = "Elf"
		//class = "abstractfactory.ElfKingdom"
		// class = "." + type + "Kingdom";
		type = "abstractfactory." + type + "Kingdom";
		KingdomFactory f = null;
		
		try {
			f = (KingdomFactory) Class.forName(type).getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return f;
	}
}
