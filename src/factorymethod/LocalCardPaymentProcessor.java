package factorymethod;

public class LocalCardPaymentProcessor implements PaymentProcessor {

    @Override
    public String processPayment(double amount) {
        double fee = amount * 0.01;
        double total = amount + fee;
        long code = System.nanoTime() % 100000;
        return String.format("LOCAL CARD: charged %.2f (fee %.2f), approval code LC-%05d", total, fee, code);
    }
}
