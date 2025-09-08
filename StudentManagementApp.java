package studentmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementApp {
    // ArrayList to store all students
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentManagementApp app = new StudentManagementApp();
        app.run(); // Start the application
    }

    /**
     * Main menu loop
     */
    public void run() {
        while (true) {
            System.out.println("\nSTUDENT MANAGEMENT SYSTEM");
            System.out.println("1. Add Student");
            System.out.println("2. Record Grade");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Print Student Report");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1": addStudentInteractive(); break;
                case "2": recordGradeInteractive(); break;
                case "3": updateStudentInteractive(); break;
                case "4": deleteStudentInteractive(); break;
                case "5": printReport(); break;
                case "6": System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice, try again.");
            }
        }
    }

    // ---------------- Interactive Methods ----------------

    private void addStudentInteractive() {
        System.out.print("Is this a Graduate Student? (y/n): ");
        String type = scanner.nextLine();

        System.out.print("Enter Student ID: "); String id = scanner.nextLine();
        System.out.print("Enter Student Name: "); String name = scanner.nextLine();

        if (type.equalsIgnoreCase("y")) {
            System.out.print("Enter Thesis Title: "); String thesis = scanner.nextLine();
            addStudent(id, name, thesis); // call boolean method
        } else {
            addStudent(id, name, null); // call boolean method
        }
        System.out.println("Student added successfully!");
    }

    private void recordGradeInteractive() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Grade: ");
        double grade = Double.parseDouble(scanner.nextLine());

        if (recordGrade(id, grade)) {
            System.out.println("Grade recorded successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    private void updateStudentInteractive() {
        System.out.print("Enter Student ID to update: ");
        String id = scanner.nextLine();

        Student student = students.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
        if (student == null) { System.out.println("Student not found."); return; }

        System.out.print("New Name (leave blank to keep current): ");
        String name = scanner.nextLine();
        if (!name.isBlank()) student.setName(name);

        if (student instanceof GraduateStudent) {
            GraduateStudent grad = (GraduateStudent) student;
            System.out.print("New Thesis Title (leave blank to keep current): ");
            String thesis = scanner.nextLine();
            if (!thesis.isBlank()) grad.setThesisTitle(thesis);
        }

        System.out.println("Student updated successfully!");
    }

    private void deleteStudentInteractive() {
        System.out.print("Enter Student ID to delete: ");
        String id = scanner.nextLine();

        if (deleteStudent(id)) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    // ---------------- Report ----------------

    public void printReport() {
        System.out.println("\nSTUDENT REPORT");
        System.out.println("*********************************");
        if (students.isEmpty()) System.out.println("No students found.");
        else students.forEach(System.out::println);
        System.out.println("*********************************");
    }

    // ---------------- Boolean Methods for Unit Testing ----------------

    /**
     * Add student to system. Returns true if added, false if ID already exists.
     */
    public boolean addStudent(String id, String name, String thesis) {
        if (students.stream().anyMatch(s -> s.getId().equals(id))) return false; // duplicate ID

        if (thesis == null) {
            students.add(new Student(id, name));
        } else {
            students.add(new GraduateStudent(id, name, thesis));
        }
        return true;
    }

    /**
     * Record a grade for a student. Returns true if successful.
     */
    public boolean recordGrade(String id, double grade) {
        Student student = students.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
        if (student == null) return false;
        student.addGrade(grade);
        return true;
    }

    /**
     * Delete a student from system. Returns true if deleted successfully.
     */
    public boolean deleteStudent(String id) {
        Student student = students.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
        if (student == null) return false;
        students.remove(student);
        return true;
    }

    // Getter for unit tests
    public ArrayList<Student> getStudents() { return students; }
}
