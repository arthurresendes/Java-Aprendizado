package ocp;

public class TesteOCP {

    public static void main(String[] args) {
          Fatura fatura = new Fatura();
          Persistencia persistencia = getPersistencia(args[0]);
          persistencia.persistir(fatura);
    }    

    private static Persistencia getPersistencia(String tipo) {
            try {
				return (Persistencia) Class.forName("ocp.Persistencia" + tipo.toUpperCase()).newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			return null;

    }
}
