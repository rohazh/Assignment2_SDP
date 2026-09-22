package abstractfactory;

public class EUPaymentFactory implements PaymentComponentFactory {

    @Override
    public Card createCard() {
        return new EUCard();
    }

    @Override
    public Receipt createReceipt() {
        return new EUReceipt();
    }

    @Override
    public Validator createValidator() {
        return new EUValidator();
    }
}
