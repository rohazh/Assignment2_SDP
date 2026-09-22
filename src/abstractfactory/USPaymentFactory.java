package abstractfactory;

public class USPaymentFactory implements PaymentComponentFactory {

    @Override
    public Card createCard() {
        return new USCard();
    }

    @Override
    public Receipt createReceipt() {
        return new USReceipt();
    }

    @Override
    public Validator createValidator() {
        return new USValidator();
    }
}
