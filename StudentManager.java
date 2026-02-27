import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);

        System.out.println("Student added successfully.");
    }

    public void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student s : students) {
            s.displayInfo();
        }
    }

    public void removeStudent(int id) {

    for (Student s : students) {
        if (s.getId() == id) {
            students.remove(s);
            System.out.println("Student removed successfully.");
            return;
        }
    }

    System.out.println("Student not found.");
}

public Student searchStudentById(int Id) {

    for (Student s : students) {
        if (s.getId() == Id) {
            return s;
        }
    }

    return null; 
}

}
