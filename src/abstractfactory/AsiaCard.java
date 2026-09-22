package abstractfactory;

public class AsiaCard implements Card {

    @Override
    public String authorize(double amount) {
        return String.format("Asia card authorized for \u00A5%.0f", amount);
    }
}
