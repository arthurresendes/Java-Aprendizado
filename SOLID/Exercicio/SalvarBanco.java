public class SalvarBanco implements Database {
    
    @Override
    public void saveOrder(String customer, String product, int quantity, double price, double total){
        System.out.println("Salvando no banco....");
    }
}
