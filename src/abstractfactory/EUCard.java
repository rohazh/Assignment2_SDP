package abstractfactory;

public class EUCard implements Card {

    @Override
    public String authorize(double amount) {
        return String.format("EU card authorized for \u20AC%.2f", amount);
    }
}
