public class DVD extends LibraryItem {
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
