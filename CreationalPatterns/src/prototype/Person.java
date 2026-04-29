package prototype;

public class Person extends Prototype<Person> implements Cloneable{

	String name;
	Long document;
	
	public Person(String n, Long d) {
		this.name = n;
		this.document = d;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Long time to build...");
	}
	
	@Override
	public String toString() {
		return String.format("Person=(name: %s, documento: %d)", name,document);
	}
}
