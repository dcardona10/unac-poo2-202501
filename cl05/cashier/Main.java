package cashier;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cashier cashier1 = new Cashier("1411", "John");
        Cashier cashier2 = new Cashier("1412", "Carlos");

        List<Item> items1 = new ArrayList<Item>();
        items1.add(new Item("4147", "Laptop", 7));
        items1.add(new Item("4148", "Wireless Headset", 5));
        items1.add(new Item("4149", "Wireless Mouse", 3));
        items1.add(new Item("4150", "USB Charger", 3));
        Client client1 = new Client("100001", "Pablo", items1);

        List<Item> items2 = new ArrayList<Item>();
        items2.add(new Item("4148", "Wireless Headset", 3));
        items2.add(new Item("4151", "HDMI Cable", 4));
        items2.add(new Item("4152", "TV UHD 4K", 8));
        Client client2 = new Client("100002", "Daniel", items2);

        long initTime = System.currentTimeMillis();

        cashier1.processCheckout(client1, initTime);
        cashier2.processCheckout(client2, initTime);

        CashierThread thread1 = new CashierThread("1411", "John", client1, initTime);
        CashierThread thread2 = new CashierThread("1412", "Carlos", client2, initTime);

        thread1.start();
        thread2.start();
    }
}
