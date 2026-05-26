public class Student {
    private int id;
    private String name;
    private int age;
    private double score;

    Student(int id,String name,int age,double score){
        this.id=id;
        this.name=name;
        this.age=age;
        setScore(score);
    }
    public int getId() {
        return this.id;
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 100) {
            this.score=score;
        }else {
            System.out.println("Invalid score! Score must be between 0 and 100.");
            this.score=0;
        }
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: "+age);
        System.out.println("Score: " + score);
        System.out.println("----------------");
    }

}
