import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentFileManager {
    private static final String FILE_NAME = "students.txt";

   
    public static void saveStudents(List<Student> students) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
               
                writer.println(s.getId() + "," + s.getName() + "," + s.getGpa() + "," + s.getDepartment() + "," + s.getYear());
            }
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    public static List<Student> loadStudents() {
        List<Student> students = new ArrayList<>();
        File file = new File(FILE_NAME);
        
        if (!file.exists()) return students; 

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    String id = parts[0];
                    String name = parts[1];
                    double gpa = Double.parseDouble(parts[2]);
                    String dept = parts[3];
                    int year = Integer.parseInt(parts[4]);
                    
                    students.add(new Student(name, id, gpa, dept, year));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading file data: " + e.getMessage());
        }
        return students;
    }
}
