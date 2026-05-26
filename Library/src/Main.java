import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<LibraryItem> catalog = new ArrayList<>();
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
                    catalog.add(new Book(id, title, author));
                    System.out.println("Book Added!");
                }
                else if(chooseType==2) {
                    System.out.print("Enter ID:");
                    int id= Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Title:");
                    String title= scanner.nextLine();
                    System.out.print("Enter Duration (minutes):");
                    String duration= scanner.nextLine();
                    catalog.add(new DVD(id, title,duration));
                    System.out.println("DVD Added!");
                }
                else {
                    System.out.println("Invalid type!");
                }
                break;
            case 2:
                if (catalog.isEmpty()) {
                    System.out.println("Catalog is empty.");
                } else {
                    for (LibraryItem item : catalog) {
                        item.display();
                    }
                }
                break;
            case 3:
                System.out.print("Enter Item ID to checkout: ");
                int checkoutId= Integer.parseInt(scanner.nextLine());
                boolean found=false;
                for(LibraryItem item:catalog){
                    if(item.getId()==checkoutId){
                        if(!item.isCheckedOut()){
                            item.checkout();
                            System.out.println("Success! '" + item.getTitle() + "' has been checked out.");
                        }
                        else {
                            System.out.println("Sorry, this item is already checked out!");
                        }
                        found=true;
                        break;
                    }
                }
                if (!found) System.out.println("Item not found.");
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