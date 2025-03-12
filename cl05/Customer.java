public class Customer extends Thread {

    private String customerId;
    private String customerName;

    public Customer(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public void run() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + customerId + '\'' +
                ", name='" + customerName + '\'' +
                '}';
    }
}
