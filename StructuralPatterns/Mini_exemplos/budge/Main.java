public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Radio rd =  new Radio();
        ControleRemoto cr1 = new ControleRemoto(tv);
        cr1.botaolLigar();
        cr1.irParaCanal(5);
        cr1.botaoDesligar();

        ControleRemoto cr2 = new ControleRemoto(rd);
        cr2.botaolLigar();
        cr2.irParaCanal(5);
        cr2.botaoDesligar();
    }
}
