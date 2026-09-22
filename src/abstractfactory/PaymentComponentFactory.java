package abstractfactory;

public interface PaymentComponentFactory {
    Card createCard();
    Receipt createReceipt();
    Validator createValidator();
}
