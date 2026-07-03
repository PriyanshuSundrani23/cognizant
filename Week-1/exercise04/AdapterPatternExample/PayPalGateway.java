package exercise04.AdapterPatternExample;

public class PayPalGateway {
    public void payWithPayPal(double amount) {
        System.out.println("Paid Rs." + amount + " using PayPal Gateway");
    }
}
