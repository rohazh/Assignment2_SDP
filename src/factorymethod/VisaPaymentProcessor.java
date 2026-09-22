package factorymethod;

public class VisaPaymentProcessor implements PaymentProcessor {

    @Override
    public String processPayment(double amount) {
        double fee = amount * 0.025;
        double total = amount + fee;
        long code = System.nanoTime() % 100000;
        return String.format("VISA: charged %.2f (fee %.2f), approval code VS-%05d", total, fee, code);
    }
}
