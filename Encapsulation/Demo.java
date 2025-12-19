// Human class demonstrates ENCAPSULATION
package Encapsulation;
class Human {

    // Instance variables are made private
    // This hides data from outside access (Data Hiding)
    private int age;
    private String name;

    // Getter method for age
    // Used to READ the value of private variable 'age'
    public int getAge() {
        return age;
    }

    // Getter method for name
    // Used to READ the value of private variable 'name'
    public String getName() {
        return name;
    }

    // Setter method for age
    // Used to MODIFY the value of private variable 'age'
    public void setAge(int a) {
        age = a;
    }

    // Setter method for name
    // Used to MODIFY the value of private variable 'name'
    public void setName(String n) {
        name = n;
    }
}

// Demo class contains main method
public class Demo {

    // Program execution starts from main method
    public static void main(String[] args) {

        // Creating object of Human class
        Human obj = new Human();

        // Setting values using setter methods
        // Direct access like obj.age = 30 is NOT allowed
        obj.setAge(30);
        obj.setName("Krish");

        // Getting values using getter methods
        // This is controlled access
        System.out.println(obj.getAge() + " : " + obj.getName());
    }
}
