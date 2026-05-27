class LibraryItem {
    private int id;
    private String title;
    private boolean isCheckedOut = false;;
    private String borrowedBy;

    public LibraryItem(int id, String title) {
        this.id = id;
        this.title = title;
        this.borrowedBy="";
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

    public void checkout(String memberName) {
        this.isCheckedOut = true;
        borrowedBy=memberName;
    }

    public void returnItem() {
        this.isCheckedOut = false;
        borrowedBy = "";
    }

    public void display() {
        String status = isCheckedOut ? "Checked Out" : "Available";
        System.out.print("ID: " + id + " | Title: " + title + " | Status: " + status);
    }
}

