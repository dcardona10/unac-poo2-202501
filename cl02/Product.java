public class Product {

    public String code;
    public String description;
    public double price;
    public boolean discount;
    public double discountPercentage;

    public double calculatePrice() {
        double finalPrice = 0;
        if (!discount) {
            finalPrice = this.price;
        } else {
            finalPrice = this.price - (this.price * (this.discountPercentage / 100));
        }

        return finalPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", discountPercentage=" + discountPercentage +
                '}';
    }
}
