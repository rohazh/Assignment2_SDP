package abstractfactory;

public class PaymentTerminal {

    private final PaymentComponentFactory factory;

    public PaymentTerminal(PaymentComponentFactory factory) {
        this.factory = factory;
    }

    public String checkout(String cardNumber, double amount) {
        Validator validator = factory.createValidator();
        if (!validator.validate(cardNumber)) {
            return "Transaction declined: invalid card number";
        }
        Card card = factory.createCard();
        String authorizationInfo = card.authorize(amount);
        Receipt receipt = factory.createReceipt();
        return authorizationInfo + "\n" + receipt.print(authorizationInfo, amount);
    }
}
