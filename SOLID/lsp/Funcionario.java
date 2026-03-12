package lsp;

public class Funcionario {
	private String nome;
	private Float salario;
	private LocalTrabalho local;
	
	public Funcionario(String nome, Float salario, LocalTrabalho local) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.local = local;
	}

	public String getNome() {
		return nome;
	}

	public Float getSalario() {
		return salario;
	}

	public LocalTrabalho getLocal() {
		return local;
	}

	
	
}
