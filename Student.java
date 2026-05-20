/* Child Class: Student
Inherits from Person Class
Demonstrates Inheritance, Encapsulation,
 and Polymorphism through Method Overriding */
public class Student extends Person {
    // Private attributes for Encapsulation
    private double gpa;
    private String department;
    private int year;

    // Constructor
    public Student(String name, String id, double gpa
            ,String department,int year) {
        // Call parent constructor
        super(name, id);
        this.gpa = gpa;
        this.department = department;
        this.year = year;
    }
    // Getters and Setters
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Overridden method (Runtime Polymorphism)
    @Override
    public void displayInfo() {

        System.out.println( "Name :" + getName() + "  Id :" + getId() +
                "  GPA :" + gpa + "  Department : " 
                + department + "  Year :" + year     
        );
    }

    // Converts object data into readable text
    // Useful for file saving and debugging
    @Override
    public String toString() {
        return getId() + "," + getName() + "," +gpa +
                "," + department + "," +  year;
    }
}
