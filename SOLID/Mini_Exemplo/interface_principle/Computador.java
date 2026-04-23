public class Computador implements Windows,ArmazenamentoPesado {
    @Override
    public void temWindows() {
        System.out.println("Computador tem windows");
        
    }

    @Override
    public void temArmazenamentoPesado() {
        System.out.println("Computador tem cpu e gpu pesadas de alto nivel");
        
    }
}
