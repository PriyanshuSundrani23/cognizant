package exercise04.AdapterPatternExample;

public class RazorpayGateway {

    public void makeRazorPayment(double amount) {
        System.out.println("Paid Rs." + amount + " using Razorpay Gateway");
    }
}