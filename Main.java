import java.util.List;

public class Main {

    public static void main(String[] args) {
        SRMS mySystem = new SRMS();
        
        List<Student> savedData = StudentFileManager.loadStudents();
        mySystem.getStudents().addAll(savedData);
        
        AutoSaveThread autoSave = new AutoSaveThread(mySystem);
        autoSave.start();

        System.out.println("Student Record Management System Started");
        System.out.println("[System] Current Database Records:");
        mySystem.displayAllStudents();
        mySystem.displayStudentsByGpa(3.5);
        mySystem.displayStudentsByDepartment("IT");
        mySystem.displayStudentsByYear(2026);
        
        System.out.println("Testing Complete. Auto-Save Active in Background.");
    }
}
