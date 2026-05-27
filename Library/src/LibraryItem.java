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

