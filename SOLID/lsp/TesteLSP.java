package lsp;

public class TesteLSP {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Arthur", 1000f, LocalTrabalho.SP);
		imprimir(f1);
		
		Analista f2 = new Analista("Davi", 100f, LocalTrabalho.RJ);
		imprimir(f2);
		
		Vendedor f3 = new Vendedor("Matheus", 10000f);
		imprimir(f3);
	}

	private static void imprimir(Funcionario f1) {
		if(f1.getLocal() == null) {
			System.out.println("Nome: " + f1.getNome() +" Salario: " + f1.getSalario());
		}else {
			System.out.println("Nome: " + f1.getNome() +" Salario: " + f1.getSalario() +" Localidade: "+ f1.getLocal());
		}
		
	}

}
