package abstractfactory;

public class EUValidator implements Validator {

    @Override
    public boolean validate(String cardNumber) {
        if (cardNumber == null) {
            return false;
        }
        String cleaned = cardNumber.replaceAll("\\s", "").toUpperCase();
        return cleaned.matches("[A-Z]{2}[0-9A-Z]{13,32}");
    }
}
