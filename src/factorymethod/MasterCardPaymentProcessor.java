package factorymethod;

public class MasterCardPaymentProcessor implements PaymentProcessor {

    @Override
    public String processPayment(double amount) {
        double fee = amount * 0.03;
        double total = amount + fee;
        long code = System.nanoTime() % 100000;
        return String.format("MASTERCARD: charged %.2f (fee %.2f), approval code MC-%05d", total, fee, code);
    }
}
