package iterator;

import java.util.HashMap;

public class Aapp {
	public static void main(String[] args) {
		var hash = new HashMap<String, Integer>();
		hash.put("a",1);
		hash.put("b",2);
		hash.put("c",3);
		hash.put("d",4);
		hash.put("e",5);
		hash.put("f",6);
		
		var it = hash.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		var file = new GetFiles("c:\\Users\\Aluno\\Downloads");
		var f = file.iterator();
		while(f.hasNext()) {
			System.out.println(f.next());;
		}
	}
}
