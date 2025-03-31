package mike.mutugi.cat2;

import mike.mutugi.cat2.q1.*;
import mike.mutugi.cat2.q2.*;

public class Main {
    public static void main(String[] args) {
        // Q1 Testing
        System.out.println("---- Q1: Encapsulation Test ----");
        Student student = new Student("Alice", 105);
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        student.setGrade(85);
        System.out.println("Updated Grade: " + student.getGrade());

        System.out.println("\n---- Q1: Overloading & Overriding Test ----");
        MathOperations mathOps = new MathOperations();
        System.out.println("Multiply two numbers (3 * 4): " + mathOps.multiply(3, 4));
        System.out.println("Multiply three numbers (2 * 3 * 4): " + mathOps.multiply(2, 3, 4));

        // Polymorphism test
        Animal dog = new Dog();
        Animal cat = new Cat();
        System.out.print("Dog sound: ");
        dog.makeSound();
        System.out.print("Cat sound: ");
        cat.makeSound();

        // Q2 Testing
        System.out.println("\n---- Q2: Abstraction Test ----");
        Appliance fan = new Fan();
        Appliance tv = new TV();
        fan.turnOn();
        tv.turnOn();

        System.out.println("\n---- Q2: Exception Handling Test ----");
        ExceptionHandlingDemo.run();
    }
}
