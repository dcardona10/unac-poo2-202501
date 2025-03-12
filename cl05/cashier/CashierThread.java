package cashier;

public class CashierThread extends Thread {

    private String id;
    private String name;
    private Client client;
    private long initTime;

    public CashierThread(String id, String name, Client client, long initTime) {
        this.id = id;
        this.name = name;
        this.client = client;
        this.initTime = initTime;
    }

    public void run() {
        System.out.println("Cashier " + this.name + " processes checkout of Client " + client.getName() + " at [" + (System.currentTimeMillis() - this.initTime) / 1000 + "] sec(s).");
        this.client.getItems().forEach(i -> {
            this.waitNSecs(i.getTime());
            System.out.println("Processing Item: " + i.getDescription() + " at [" + (System.currentTimeMillis() - this.initTime) / 1000 + "] sec(s).");
        });
        System.out.println("Cashier " + this.name + " finishes checkout of Client " + client.getName() + " at [" + (System.currentTimeMillis() - this.initTime) / 1000 + "] sec(s).");
    }

    private void waitNSecs(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
