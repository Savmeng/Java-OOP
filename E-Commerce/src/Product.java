abstract class Product {
    private int id;
    private String name;
    private double basePrice;
    public Product(int id,String name,double basePrice){
        this.id=id;
        this.name=name;
        this.basePrice=basePrice;
    }

    public int getId() {
        return id;
    }
    public String getName() { return name; }
    public double getBasePrice() { return basePrice; }

    public abstract double calculatePrice();
}
class Electronics extends Product{
    public Electronics(int id,String name,double basePrice){
        super(id,name,basePrice);
    }
    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.10;
    }
}
class Clothing extends Product{
    public Clothing(int id,String name,double basePrice){
        super(id,name,basePrice);
    }
    @Override
    public double calculatePrice() {
        return getBasePrice() * 0.85;
    }
}

