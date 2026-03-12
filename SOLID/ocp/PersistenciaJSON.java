package ocp;

public class PersistenciaJSON implements Persistencia {

	@Override
	public void persistir(Fatura fatura) {
		System.out.println("Salvando em JSON");
	}

}
