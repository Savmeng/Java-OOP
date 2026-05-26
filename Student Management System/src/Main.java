import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("====== STUDENT MANAGEMENT =========");
            System.out.println("1.Add Student \n2.View Student \n3.Search Student \n4.Delete Student \n5.Exit ");
            System.out.print("\nChoose option (1-5): ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Score: ");
                    double score = Double.parseDouble(sc.nextLine());

                    Student s = new Student(id, name, age, score);

                    students.add(s);
                    System.out.println("Student Added!");
                    break;
                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student st : students) {
                            st.display();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter student ID to search: ");
                    int searchId= Integer.parseInt(sc.nextLine());
                    boolean found=false;
                    for (Student st : students) {
                        if (st.getId() == searchId) {
                            st.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    boolean removed = false;
                    for (Student st : students) {

                        if (st.getId() == deleteId) {
                            students.remove(st);
                            removed = true;
                            System.out.println("Student deleted.");
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.println("Program Ended.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}