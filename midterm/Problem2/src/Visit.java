public class Visit {
    private Customer customer;
    private String date;
    private double serviceExpence, productExpence;

    public Visit(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public String getName() { return this.customer.getName(); }

    public double getServiceExpence() {
        if (customer.isMember()) {
            return serviceExpence * (1 - DiscountRate.getServiceDiscountRate(customer.getMemberType()));
        }
        return serviceExpence;
    }

    public void setServiceExpence(double serviceExpence) { this.serviceExpence = serviceExpence; }

    public double getProductExpence() {
        if (customer.isMember()) {
            return productExpence * (1 - DiscountRate.getProductDiscountRate(customer.getMemberType()));
        }
        return productExpence;
    }

    public void setProductExpence(double productExpence) { this.productExpence = productExpence; }

    public double getTotalExpence() { return getServiceExpence() + getProductExpence(); }

    public String toString() { return "Customer " + this.getName() + " came in " + date; }
}
