import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do {

            System.out.println("========StudyFlow==========");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Search Student ");
            System.out.println("5. Exit");
            System.out.println("===========================");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter ID: ");
                    int id = input.nextInt();

                    System.out.print("Enter Score: ");
                    double grade = input.nextDouble();

                    Student s = new Student(name, id, grade);
                    manager.addStudent(s);
                    break;

                case 2:
                    manager.showAllStudents();
                    break;
                    
                case 3:
                        System.out.print("Enter ID to remove : ");
                        int removeid = input.nextInt();
                        manager.removeStudent(removeid);
                        break; 

                case 4:
                    
                     System.out.print("Enter student ID: ");
                    int Id = input.nextInt();
                    Student result = manager.searchStudentById(Id);
                    if (result != null) {
                        result.displayInfo();
                    } else {
                        System.out.println("Student not found.");
                    }

                case 5:
                    System.out.println("Goodbye!");
                    break;


                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        input.close();
    }
}
