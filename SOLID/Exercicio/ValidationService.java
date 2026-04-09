public class ValidationService{

    public void validationOrder(String customerName,String product){
        if (customerName == null || product == null) {
            System.out.println("Dados inválidos");
            return;
        }
    }

}
