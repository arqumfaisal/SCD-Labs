package Lab3Task3;

public class Refund {
	private float amount;
    private String customerId;

    public Refund(float amount, String customerId) {
        this.amount = amount;
        this.customerId = customerId;
    }

    public void refundAmount() {
        System.out.println("Refunding amount: " + amount + " to customer ID: " + customerId);
    }
}
