package org.example;

public class Student {
    String name;
    int age;
    String grade;

    // A constructor in Java is a special method that is used to initialize objects.
    // The constructor is called when an object of a class is created.
    // It can be used to set initial values for object attributes
    // unsure if this is classfieid as a primary constructor
    // is it better to have a primary or default constructor as then you arent' able to set initial values for object attributes
    //constructor name must match the class name, and it cannot have a return type (like void)

    // Constructors can also take parameters, which is used to initialize attributes.
    Student(String name, int age, String grade){
        this.name = name; // set initial value of this class atribute to be whatever the user defines name as
        this.age = age;
        this.grade = grade;
    }

//    public void setName (String newName){
//        this.name = newName;
//        // this keyword name variable is being given a new value due to iniitlising it on lin 17
//    }
//    public void setAge (int newAge){
//        this.age = newAge;
//    }
//    public void setGrade (String newGrade){
//       this.grade = newGrade;
//    }

    public String getName(){
        return name; // returns the users name that has been set in the paramter on line 22
    }
    public int getAge(){
        return age;
    }
    public String getGrade(){
        return grade;
    }

}
