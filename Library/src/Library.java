import java.util.ArrayList;

public class Library {
     ArrayList<LibraryItem> catalog ;
     public Library(){
         catalog =new ArrayList<>();
     }
     public void addItem(LibraryItem item){
         for(LibraryItem i:catalog){
             if(i.getId()==item.getId()){
                 System.out.println("Item with this ID already exists!");
                 return;
             }
         }
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
     public LibraryItem findItem(int id){
         for(LibraryItem item:catalog){
             if(item.getId()==id){
                 return item;
             }
         }
         return null;
     }
     public void checkoutItem(int id,String memberName){
         LibraryItem item = findItem(id);
         if (item != null) {
             if (!item.isCheckedOut()) {
                 item.checkout(memberName);
                 System.out.println("Success! '" + item.getTitle() + "' has been checked out.");
             } else {
                 System.out.println("Sorry, this item is already checked out!");
             }
         } else {
             System.out.println("Item not found.");
         }
     }
     public void returnItem(int id){
         LibraryItem item = findItem(id);
         if (item != null) {
             if (item.isCheckedOut()) {
                 item.returnItem();
                 System.out.println("Success! '" + item.getTitle() + "' has been returned.");
             } else {
                 System.out.println("Item is already available");
             }
         } else {
             System.out.println("Item not found.");
         }
     }
}