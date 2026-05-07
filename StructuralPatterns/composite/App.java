package composite;

public class App {
	public static void main(String[] args) {
		CompositeDepartament clevel  = new CompositeDepartament("C- level");
		CompositeDepartament tech  = new CompositeDepartament("Technoligy");
		CompositeDepartament mkt  = new CompositeDepartament("Marketing");
		CompositeDepartament hr  = new CompositeDepartament("Human Resources");
		
		clevel.add(tech).add(mkt).add(hr);
		tech.add(new Departament("Software Enginner")).add(new Departament("Data Science")).add(new Departament("Cyber Security"));
		mkt.add(new Departament("Branding")).add(new Departament("Sales"));
		
		
		clevel.print();
	}
}
