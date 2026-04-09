public class ProcessarService {
    
    private CheckService checker = new CheckService();
    private ValidationService validator = new ValidationService();
    private PriceService priceSvc = new PriceService();
    private TotalService totalSvc = new TotalService();
    private Database banco = new SalvarBanco();

    public void executarPedido(String customer, String product, int quantity) {
        checker.checkQuantityOrder(quantity);

        validator.validationOrder(customer, product);

        double unitPrice = priceSvc.priceOrder(0.0, quantity, product); 

        double total = totalSvc.totalOrder(unitPrice, quantity);

        banco.saveOrder(customer, product, quantity, unitPrice, total);
    }
}