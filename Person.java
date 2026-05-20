// Parent Class: Person
// Demonstrates Inheritance and Encapsulation
public class Person {
     // Private attributes for Encapsulation
    private String name;
    private String id;

    // Constructor
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Method to demonstrate Polymorphism
    public void displayInfo() {
        System.out.println("Name: " +name + ", ID: " +id);
    }
}
