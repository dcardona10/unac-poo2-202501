package cashier;

public class Cashier {

    private String id;
    private String name;

    public Cashier(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void processCheckout(Client client, long timestamp) {
        System.out.println("Cashier " + this.name + " processes checkout of Client " + client.getName() + " at [" + (System.currentTimeMillis() - timestamp) / 1000 + "] sec(s).");
        client.getItems().forEach(i -> {
            this.waitNSecs(i.getTime());
            System.out.println("Processing Item: " + i.getDescription() + " at [" + (System.currentTimeMillis() - timestamp) / 1000 + "] sec(s).");
        });
        System.out.println("Cashier " + this.name + " finishes checkout of Client " + client.getName() + " at [" + (System.currentTimeMillis() - timestamp) / 1000 + "] sec(s).");
    }

    private void waitNSecs(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
