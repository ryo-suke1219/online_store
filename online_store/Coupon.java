interface Discountable {
    double getDiscountedPrice();
}

class Coupon implements Discountable {
    private String code;
    private double discount;

    public Coupon(String code, double discount) {
        this.code = code;
        this.discount = discount;
    }

    public String getCode() {
        return code;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public double getDiscountedPrice() {
        return discount;
    }

    public double applyCoupon(double totalPrice) {
        return totalPrice - discount;
    }
}
