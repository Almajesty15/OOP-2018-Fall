public class DiscountRate {
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String type) {
        if (type.equals("Premium")) return 0.2;
        else if (type.equals("Gold")) return 0.15;
        return 0.1;
    }

    public static double getProductDiscountRate(String type) { return 0.1; }
}
