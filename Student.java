public class Student {

    private String name;
    private int id;
    private double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String calculateGrade() {
        if (grade >= 90)
            return "A";
        else if (grade >= 80)
            return "B";
        else if (grade >= 70)
            return "C";
        else if (grade >= 60)
            return "D";
        else
            return "F";
    }
    
     public int getId() {
         return id;
}
    public void displayInfo() {

        System.out.println("----------------------");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Score: " + grade);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("----------------------");
    }
}
