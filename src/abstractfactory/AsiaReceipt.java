package abstractfactory;

public class AsiaReceipt implements Receipt {

    @Override
    public String print(String cardInfo, double amount) {
        return "==== ASIA RECEIPT ====\n" + cardInfo
                + "\nAmount: \u00A5" + String.format("%.0f", amount)
                + "\nArigatou gozaimasu";
    }
}
