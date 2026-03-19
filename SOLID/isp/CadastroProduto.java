package isp;

public class CadastroProduto implements Cadastravel {
	@Override
	public void salvarBD() {
		System.out.println("Produto salvo...");
	}
	
	@Override
	public void notificar() {
		System.out.println("Evento: produto cadastrado");
	}
}
