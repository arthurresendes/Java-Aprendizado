public class CheckService{
    public void checkQuantityOrder(int quantity){
        if (quantity <= 0) {
            throw new RuntimeException("Quantidade inválida");
        }
    }
}
