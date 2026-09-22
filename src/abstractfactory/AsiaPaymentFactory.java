package abstractfactory;

public class AsiaPaymentFactory implements PaymentComponentFactory {

    @Override
    public Card createCard() {
        return new AsiaCard();
    }

    @Override
    public Receipt createReceipt() {
        return new AsiaReceipt();
    }

    @Override
    public Validator createValidator() {
        return new AsiaValidator();
    }
}
