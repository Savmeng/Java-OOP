class LibraryItem {
    private int id;
    private String title;
    private boolean isCheckedOut = false;

    public LibraryItem(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkout() {
        this.isCheckedOut = true;
    }

    public void returnItem() {
        this.isCheckedOut = false;
    }

    public void display() {
        String status = isCheckedOut ? "Checked Out" : "Available";
        System.out.print("ID: " + id + " | Title: " + title + " | Status: " + status);
    }
}
class Book extends LibraryItem {
        private String author;

        public Book(int id, String title, String author) {
            super(id, title);
            this.author = author;
        }

        @Override
        public void display() {
            super.display();
            System.out.println(" | Author: " + author + " [Type: Book]");
        }
}

class DVD extends LibraryItem {
        private String duration;

        public DVD(int id, String title, String duration) {
            super(id, title);
            this.duration = duration;
        }

        @Override
        public void display() {
            super.display();
            System.out.println(" | Duration: " + duration + "mins [Type: DVD]");
    }
}
