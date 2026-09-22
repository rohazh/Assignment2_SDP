package abstractfactory;

public class AsiaValidator implements Validator {

    @Override
    public boolean validate(String cardNumber) {
        if (cardNumber == null) {
            return false;
        }
        String cleaned = cardNumber.replaceAll("\\s", "");
        return cleaned.matches("\\d{14,19}");
    }
}
