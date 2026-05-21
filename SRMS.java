import java.util.ArrayList;
import java.util.List;
public class SRMS {
     // Composition:
    // SRMS HAS-A list of Student objects
    private List<Student> students;

    // Constructor
    public SRMS() {
        students = new ArrayList<>();
    }

    // ==========================================
    // Add a new student
    // Prevents duplicate student IDs
    // ==========================================
    public void addStudent(Student student) {

        // Check if student ID already exists
        if (findStudentById(student.getId()) != null) {

            System.out.println(
                    "Error: Student with ID "
                    + student.getId()
                    + " already exists."
            );

            return;
        }

        students.add(student);

        System.out.println(
                "Student "
                + student.getName()
                + " added successfully."
        );
    }

    // ==========================================
    // Search for a student using student ID
    // Returns Student object if found
    // ==========================================
    public Student findStudentById(String id) {

        for (Student s : students) {

            if (s.getId().equals(id)) {
                return s;
            }
        }

        return null;
    }

    // ==========================================
    // Update student GPA and department
    // ==========================================
    public void updateStudent(String id,
                              double newGpa,
                              String newDepartment) {

        Student s = findStudentById(id);

        if (s != null) {

            // Using setters (Encapsulation)
            s.setGpa(newGpa);
            s.setDepartment(newDepartment);

            System.out.println(
                    "Student record updated successfully."
            );

        } else {

            System.out.println("Student not found.");
        }
    }

    // ==========================================
    // Delete student record using ID
    // ==========================================
    public void deleteStudent(String id) {

        Student s = findStudentById(id);

        if (s != null) {

            students.remove(s);

            System.out.println(
                    "Student record deleted successfully."
            );

        } else {

            System.out.println("Student not found.");
        }
    }

    // ==========================================
    // Display all student records
    // ==========================================
    public void displayAllStudents() {

        if (students.isEmpty()) {

            System.out.println("No student records found.");

        } else {

            for (Student s : students) {

                // Polymorphism:
                // Calls overridden displayInfo() method
                s.displayInfo();
            }
        }
    }

    // Getter for student list
    public List<Student> getStudents() {
        return students;
    }
    
    public void displayStudentsByGpa(double minGpa) {
        System.out.println("\n--- [Report] Students with GPA >= " + minGpa + " ---");
        boolean found = false;
        
        for (Student s : students) {
            if (s.getGpa() >= minGpa) {
                s.displayInfo();
                 found = true;
            }
        }
        
        if (!found) {
            System.out.println("No student records match the criteria.");
        }
    }

  
    public void displayStudentsByDepartment(String dept) {
        System.out.println("\n--- [Report] Students in Department: " + dept + " ---");
        boolean found = false;
        
        for (Student s : students) {
            
            if (s.getDepartment().equalsIgnoreCase(dept)) {
                s.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No student records found for department: " + dept);
        }
    }
     public void displayStudentsByYear(int year) {

    System.out.println(
        "\n--- [Report] Students in Year: "
        + year +
        " ---"
    );

    boolean found = false;
    for (Student s : students) {
        if (s.getYear() == year) {
            s.displayInfo();
            found = true;
        }
    }
    if (!found) {

        System.out.println(
            "No student records found for year: "
            + year
        );
    }
}
}
