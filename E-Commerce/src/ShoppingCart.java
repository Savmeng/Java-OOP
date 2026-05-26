import java.util.ArrayList;

class ShoppingCart {
    private ArrayList<Product> cartItems=new ArrayList<>();

    public void addProduct(Product p){
        cartItems.add(p);
        System.out.println(p.getName()+" added to cart.");
    }
    public void showReceipt(){
        System.out.println("\n===== Your Receipt ======");
        double total=0;
        for(Product p:cartItems){
            double finalPrice=p.calculatePrice();
            total+=finalPrice;
            System.out.printf("%s | Base: $%.2f | Final price: $%.2f\n",p.getName(),p.getBasePrice(),finalPrice);
        }
        System.out.printf("Total Amount Due: $%.2f\n", total);
    }
}
