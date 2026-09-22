package factorymethod;

public class VisaGateway extends PaymentGateway {

    @Override
    protected PaymentProcessor createProcessor() {
        return new VisaPaymentProcessor();
    }
}
