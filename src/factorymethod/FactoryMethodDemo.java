package factorymethod;

import java.util.LinkedHashMap;
import java.util.Map;

public class FactoryMethodDemo {

    private static final Map<String, PaymentGateway> GATEWAYS = new LinkedHashMap<>();

    static {
        GATEWAYS.put("visa", new VisaGateway());
        GATEWAYS.put("mastercard", new MasterCardGateway());
        GATEWAYS.put("local", new LocalCardGateway());
    }

    public static void main(String[] args) {
        String[] cardTypes = {"visa", "mastercard", "local"};
        double[] amounts = {150.0, 320.5, 75.0};

        for (int i = 0; i < cardTypes.length; i++) {
            PaymentGateway gateway = GATEWAYS.get(cardTypes[i]);
            if (gateway == null) {
                System.out.println("Unsupported card type: " + cardTypes[i]);
                continue;
            }
            System.out.println(gateway.processTransaction(amounts[i]));
        }
    }
}
