package singleton;

public class Database {
	public static int counter;
	private static Database db;
	
	private Database() {
		counter++;
	}
	
	public static Database getInstance() {
		if(db == null)
			db = new Database();
		
		return db;
	}
	
}
