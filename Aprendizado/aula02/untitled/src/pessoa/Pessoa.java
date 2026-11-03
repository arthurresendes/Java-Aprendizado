package pessoa;

import carro.Carro;

public class Pessoa {
    Carro carro;

    public Pessoa(Carro carro){
        this.carro = carro;
        this.carro.teste();
    }

}
