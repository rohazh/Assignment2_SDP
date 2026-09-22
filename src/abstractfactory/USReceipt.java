package abstractfactory;

public class USReceipt implements Receipt {

    @Override
    public String print(String cardInfo, double amount) {
        return "==== US RECEIPT ====\n" + cardInfo
                + "\nAmount: $" + String.format("%.2f", amount)
                + "\nThank you for your purchase!";
    }
}
