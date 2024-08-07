abstract class PaymentMethod {
    protected String ownerName;

    public PaymentMethod(String ownerName) {
        this.ownerName = ownerName;
    }

    public abstract String getPaymentDetails();
}

class CreditCard extends PaymentMethod {
    private String cardNumber;
    private String expiryDate;

    public CreditCard(String ownerName, String cardNumber, String expiryDate) {
        super(ownerName);
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public String getPaymentDetails() {
        return "Credit Card: " + cardNumber + ", Expiry Date: " + expiryDate;
    }
}

class PayPal extends PaymentMethod {
    private String email;

    public PayPal(String ownerName, String email) {
        super(ownerName);
        this.email = email;
    }

    @Override
    public String getPaymentDetails() {
        return "PayPal: " + email;
    }
}
