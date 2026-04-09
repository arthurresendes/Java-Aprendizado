public interface Database {
    void saveOrder(String customer, String product, int quantity, double price, double total);
} 
