public class PriceService{

    public double priceOrder(Double price, int quantity, String product){
        if (product.equals("Book")) {
            price = 50.50;
        } else if (product.equals("Pen")) {
            price = 5.50;
        }
        return price;
    }
}
