package abstractfactory;

public class USCard implements Card {

    @Override
    public String authorize(double amount) {
        return String.format("US card authorized for $%.2f", amount);
    }
}
