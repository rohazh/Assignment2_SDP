package abstractfactory;

public class EUReceipt implements Receipt {

    @Override
    public String print(String cardInfo, double amount) {
        return "==== EU RECEIPT ====\n" + cardInfo
                + "\nAmount: \u20AC" + String.format("%.2f", amount)
                + "\nVielen Dank fur Ihren Einkauf!";
    }
}
