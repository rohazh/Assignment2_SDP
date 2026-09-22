package factorymethod;

public class MasterCardGateway extends PaymentGateway {

    @Override
    protected PaymentProcessor createProcessor() {
        return new MasterCardPaymentProcessor();
    }
}
