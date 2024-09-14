package Lab2;

public class User {
    private String name;
    private int age;
    private String hobby;

    // Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display user's name and age
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Overloaded method to display user's name, age, and hobby
    public void displayInfo(String hobby) {
        this.hobby = hobby;
        System.out.println("Name: " + name + ", Age: " + age + ", Hobby: " + hobby);
    }

    // Overloaded method to display years until retirement
    public void displayInfo(int yearsUntilRetirement) {
        System.out.println(name + " will retire in " + yearsUntilRetirement + " years.");
    }
}
