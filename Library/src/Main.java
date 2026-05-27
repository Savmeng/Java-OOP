import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
    while(true){
        System.out.println("====== LIBRARY CATALOG =========");
        System.out.println("1.Add Item \n2.View Catalog \n3.Checkout Item \n4.Exit");
        System.out.print("Choose option (1-4): ");
        int choice= Integer.parseInt(scanner.nextLine());
        switch(choice){
            case 1:
                System.out.print("Choose type (1 for Book,2 for DVD): ");
                int chooseType= Integer.parseInt(scanner.nextLine());
                if(chooseType==1){
                    System.out.print("Enter ID:");
                    int id= Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Title:");
                    String title= scanner.nextLine();
                    System.out.print("Enter Author:");
                    String author= scanner.nextLine();
                    Book book =new Book(id,title,author);
                    library.addItem(book);

                }
                else if(chooseType==2) {
                    System.out.print("Enter ID:");
                    int id= Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Title:");
                    String title= scanner.nextLine();
                    System.out.print("Enter Duration (minutes):");
                    String duration= scanner.nextLine();
                    DVD dvd=new DVD(id,title,duration);
                    library.addItem(dvd);
                }
                else {
                    System.out.println("Invalid type!");
                }
                break;
            case 2:
                    library.viewCatalog();
                break;
            case 3:
                System.out.print("Enter Item ID to checkout: ");
                int checkoutId= Integer.parseInt(scanner.nextLine());
                library.checkoutItem(checkoutId);
                break;
            case 4:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                System.out.println("Invalid option! Please choose between 1-4.");
            }
        }
    }
}