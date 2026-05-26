public class Account {
    private int id;
    private String name;
    private int pin;
    private double balance;
    public Account(int id, String name, int pin, double balance) {
        this.id = id;
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }
    public  int getId(){
        return id;
    }

    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

}
