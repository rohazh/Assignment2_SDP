package abstractfactory;

public class RegionFactoryProvider {

    public static PaymentComponentFactory getFactory(String region) {
        switch (region.toLowerCase()) {
            case "us":
                return new USPaymentFactory();
            case "eu":
                return new EUPaymentFactory();
            case "asia":
                return new AsiaPaymentFactory();
            default:
                throw new IllegalArgumentException("Unsupported region: " + region);
        }
    }
}
