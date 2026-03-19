package isp;

public class CadastroCliente implements Cadastravel,Verificavel{
	

	@Override
	public void salvarBD() {
		System.out.println("Cliente salvo no BD");
	}
	
	@Override
	public void notificar() {
		System.out.println("Evento: cliente novo");
	}

	@Override
	public void enviarSMS() {
		System.out.println("SMS enviado");
		
	}
	
}
