import java.util.ArrayList;

public class Library {
     ArrayList<LibraryItem> catalog ;
     public Library(){
         catalog =new ArrayList<>();
     }
     public void addItem(LibraryItem item){
         catalog.add(item);
         if(item instanceof  Book){
             System.out.println("Book Added!");
         } else if (item instanceof DVD) {
             System.out.println("DVD Added!");
         }
     }
     public void viewCatalog(){
             if (catalog.isEmpty()) {
                 System.out.println("Catalog is empty.");
             } else {
                 for (LibraryItem item : catalog) {
                     item.display();
                 }
             }
     }
     public void checkoutItem(int id){
         for(LibraryItem item:catalog){
             if(item.getId()==id) {
                 if (!item.isCheckedOut()) {
                     item.checkout();
                     System.out.println("Success! '" + item.getTitle() + "' has been checked out.");
                 }
                 else {
                     System.out.println("Sorry, this item is already checked out!");
                 }
                 return;
             }
         }
         System.out.println("Item not found.");
     }
}