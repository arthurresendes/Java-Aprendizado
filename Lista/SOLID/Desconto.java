package Lista.SOLID;


public interface Desconto {
    Float aplicar(Float preco);
}


class DescontoVIP implements Desconto {
    public Float aplicar(Float preco) { return preco * 0.5f; }
}

class DescontoNormal implements Desconto {
    public Float aplicar(Float preco) { return preco; } // Sem desconto
}