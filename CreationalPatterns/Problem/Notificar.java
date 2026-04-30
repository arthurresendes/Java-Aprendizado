import Veiculo.Type;

public class Notificar {
    public static Veiculo create(Type type) {
		switch (type) {
		case Carro: return new CarroNotification();
		case Moto: return new MotoNotification();
		case Bicicleta: return new BicicletaNotification();
		default: throw new IllegalArgumentException("Unknown type");
		}
}
}
