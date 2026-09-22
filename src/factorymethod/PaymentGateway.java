package factorymethod;

public abstract class PaymentGateway {

    protected abstract PaymentProcessor createProcessor();

    public String processTransaction(double amount) {
        PaymentProcessor processor = createProcessor();
        String result = processor.processPayment(amount);
        return "[" + getClass().getSimpleName() + "] " + result;
    }
}
