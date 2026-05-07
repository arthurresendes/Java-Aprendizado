package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeDepartament extends Departament{
	public CompositeDepartament(String name) {
		super(name);
	}

	private List<Departament> children = new ArrayList<Departament>();
	
	public CompositeDepartament add(Departament departament) {
		children.add(departament);
		return this;
	}
	
	public CompositeDepartament remove(Departament departament) {
		children.remove(departament);
		return this;
	}
	
	@Override
	public void print() {
		//		for(int i = 0; i < children.size();i++) {
		//			Departament child = children.get(i);
		//			child.print();
		//		}
		//children.forEach(i -> {
		// 	i.print();
		//}
		children.forEach(Departament::print);
		super.print();
		System.out.println();
	}
}
