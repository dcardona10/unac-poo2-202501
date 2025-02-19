import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        int option = -1;
        Scanner input = new Scanner(System.in);
        String discount = "";
        List<Product> products = new ArrayList<Product>();

        while (option != 0) {
            System.out.println("1. Insert Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Show Products");
            System.out.println("4. Show Total Price");
            System.out.println("5. Search Product by Name");
            System.out.println("0. Exit");
            option = input.nextInt();

            switch (option) {
                case 1:
                    Product product = new Product();
                    System.out.print("Code: ");
                    product.code = input.next();
                    System.out.print("Description: ");
                    product.description = input.next();
                    System.out.print("Price: ");
                    product.price = input.nextDouble();
                    System.out.print("Discount? (Y/N)");
                    discount = input.next();
                    if (discount.equals("Y")) {
                        product.discount = true;
                        System.out.print("Discount %: ");
                        product.discountPercentage = input.nextDouble();
                    } else {
                        product.discount = false;
                    }
                    product.price = product.calculatePrice();
                    products.add(product);
                    break;
                case 2:
                    System.out.print("Select code to remove: ");
                    String code = input.next();
                    /*for (Product prod : products) {
                        if (prod.code.equals(code)) {
                            products.remove(prod);
                            break;
                        }
                    }*/
                    products.forEach(p -> {
                        if (p.code.equals(code)) {
                            products.remove(p);
                        }
                    });
                    break;
                case 3:
                    /*for (Product prod : products) {
                        System.out.println(prod.toString());
                    }*/
                    products.forEach(p -> System.out.println(p.toString()));
                    break;
                case 4:
                    double total = 0;
                    for (Product prod : products) {
                        total += prod.price;
                    }
                    System.out.print("Total Price: " + total);
                    break;
                case 5:
                    System.out.print("Insert keyword: ");
                    String keyword = input.next();
                    List<Product> productSearch = products.stream()
                            .filter(p -> p.description.contains(keyword))
                            .toList();

                    productSearch.forEach(p -> System.out.println(p));
                default:
                    System.out.print("List Size: " + products.size());
            }
        }
    }
}
