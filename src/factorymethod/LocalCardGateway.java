package factorymethod;

public class LocalCardGateway extends PaymentGateway {

    @Override
    protected PaymentProcessor createProcessor() {
        return new LocalCardPaymentProcessor();
    }
}
