
package studentmanagement;
import java.util.ArrayList;

public class Student {
    private String id;
    private String name;
    private ArrayList<Double> grades;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    public ArrayList<Double> getGrades() { return grades; }

    public void setName(String name) { this.name = name; }

    // Add a grade to the student
    public void addGrade(double grade) { grades.add(grade); }

    // Calculate average grade
    public double calculateAverage() {
        if(grades.isEmpty()) return 0;
        double sum = 0;
        for(double g : grades) sum += g;
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student ID: " + id +
               "\nName: " + name +
               "\nGrades: " + grades +
               "\nAverage: " + String.format("%.2f", calculateAverage()) +
               "\n------------------------";
    }
}


