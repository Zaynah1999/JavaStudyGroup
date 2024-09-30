package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Zaynah", 24, "A");
//        Kept old code here as initially this worked
//        s1.setName("Zaynah");
//        s1.setAge(24);
//        s1.setGrade("A");

        Student s2 = new Student("Lucy", 19, "B");

        Student s3 = new Student("Joe", 19, "C");

        System.out.println("This student is called " + s1.getName() + " and they are " + s1.getAge() + ". The grade they have achieved is " + s1.getGrade());
        System.out.println("This student is called " + s2.getName() + " and they are " + s2.getAge() + ". The grade they have achieved is " + s2.getGrade());
        System.out.println("This student is called " + s3.getName() + " and they are " + s3.getAge() + ". The grade they have achieved is " + s3.getGrade());


        Manager manager = new Manager("Zaynah", 1, 96000, 4000);
        Developer developer = new Developer("Kieran", 2, 105000, new String[]{"Java", "Python", "C++"});
        System.out.println(manager.displayUser());
        System.out.println(developer.displayUser());


        // Create a new BankInterface object
        BankInterface bankInterface = new BankInterface();
        // Create a new BankAccount object with an initial balance
        Bank account = new Bank(500.0); // For example, starting balance is $500
        // Start the user interface
        bankInterface.showMenu(account);


        // Create a Circle object with radius 5
        Shape circle = new Circle(5);
        System.out.println("The area of the circle is " + circle.calculateArea());
        // Create a Rectangle object with width 4 and height 6
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("The Area of the rectangle is  " + rectangle.calculateArea());

        // Create a Dog object and call makeSound
        Animal dog = new Dog();
        dog.makeSound();
        // Create a Cat object and call makeSound
        Animal cat = new Cat();
        cat.makeSound();

        // Create a Car object and call methods
        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();

        // Create a Bike object and call methods
        Vehicle bike = new Bike();
        bike.startEngine();
        bike.stopEngine();
    }
}