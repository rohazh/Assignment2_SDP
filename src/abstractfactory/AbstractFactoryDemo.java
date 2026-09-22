package abstractfactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        PaymentTerminal usTerminal = new PaymentTerminal(RegionFactoryProvider.getFactory("us"));
        System.out.println(usTerminal.checkout("4111111111111111", 89.99));
        System.out.println();

        PaymentTerminal euTerminal = new PaymentTerminal(RegionFactoryProvider.getFactory("eu"));
        System.out.println(euTerminal.checkout("DE89370400440532013000", 54.30));
        System.out.println();

        PaymentTerminal asiaTerminal = new PaymentTerminal(RegionFactoryProvider.getFactory("asia"));
        System.out.println(asiaTerminal.checkout("3566002020360505", 12000));
    }
}
