package dip;

import java.util.List;

public class ClienteService {
	
	private Repository<Cliente> repository;
	
	public ClienteService(Repository<Cliente> repository) {
		this.repository = repository;
	}
	
	public void adicionarCliente(Cliente c) {
		repository.create(c);
	}
	
	public List<Cliente> localizarPorNome(String nome){
		return repository.retrieve();
	}
}
