interface Product {
    double getPrice();
}

class Book implements Product {
    public double getPrice() {
        return 50;
    }
}

class Pen implements Product {
    public double getPrice() {
        return 5;
    }
}

class ProductFactory {
    public static Product createProduct(String type) {
        if (type.equalsIgnoreCase("book")) {
            return new Book();
        } else if (type.equalsIgnoreCase("pen")) {
            return new Pen();
        }
        throw new IllegalArgumentException("Produto inválido");
    }
}

interface PaymentMethod {
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Pagando R$" + amount + " com cartão");
    }
}

class PaypalPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Pagando R$" + amount + " com Paypal");
    }
}

class PaymentFactory {
    public static PaymentMethod createPayment(String type) {
        if (type.equalsIgnoreCase("creditcard")) {
            return new CreditCardPayment();
        } else if (type.equalsIgnoreCase("paypal")) {
            return new PaypalPayment();
        }
        throw new IllegalArgumentException("Pagamento inválido");
    }
}

interface OrderRepository {
    void save(String customer, String product, int quantity, double total);
}

class DatabaseRepository implements OrderRepository {
    public void save(String customer, String product, int quantity, double total) {
        System.out.println("Salvando no banco...");
    }
}

class OrderService {

    private OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public void processOrder(String customerName, String productType, int quantity, String paymentType) {

        if (customerName == null || productType == null || quantity <= 0) {
            throw new IllegalArgumentException("Dados inválidos");
        }

        Product product = ProductFactory.createProduct(productType);
        double total = product.getPrice() * quantity;

        PaymentMethod payment = PaymentFactory.createPayment(paymentType);
        payment.pay(total);

        repository.save(customerName, productType, quantity, total);

        System.out.println("Pedido processado com sucesso!");
    }
}

public class Main {
    public static void main(String[] args) {

        OrderRepository repo = new DatabaseRepository();
        OrderService service = new OrderService(repo);

        service.processOrder("Arthur", "book", 2, "creditcard");
    }
}