public class Main {
    public static void main(String[] args) {
    ShoppingCart cart=new ShoppingCart();
    cart.addProduct(new Electronics(1,"Laptop",1000));
    cart.addProduct(new Clothing(2,"Sweater",30));
    cart.addProduct(new Electronics(3,"Smartphone",800));
    cart.showReceipt();
    }
}