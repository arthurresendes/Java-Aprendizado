package prototype;

public class App {
	 public static void main(String[] args) {
		Person p1 = new Person("João", 987654L);
		System.out.println(p1);
		
		Person p2 = p1.copy(); //new Person("Pedro", 123456L);
		p2.name = "Pedro";
		p2.document = 123456L;
		System.out.println(p2);
		
		Person p3 = p2.copy(); // new Person("Batman", 159357L);
		p3.name = "Batman";
		p3.document = 159357L;
		System.out.println(p3);
	}
}
