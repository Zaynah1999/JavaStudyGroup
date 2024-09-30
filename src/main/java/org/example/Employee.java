package org.example;

public class Employee {
    String name;
    int id;
    double salary;

    Employee (String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }

    public String displayUser() {
        return "This person is called " + name + ". Their ID is " + id + ". Their Salary is " + salary;
    }
}

class Manager extends Employee {
    // bit confused as to why IntelliJ correct double bonus to private final to ensure line 39 worked
    private final double bonus;

    // create constructor but also retrieve values from above class using super key word
    public Manager(String name, int id, double salary, double bonus)
    {
        super(name, id, salary);
        this.bonus = bonus;

    }

    @Override
    public String displayUser()
    {
        return super.displayUser() + ". Their Bonus is " + bonus;
    }
}

class Developer extends Employee {
    private final String[] programmingLanguages;

    public Developer(String name, int id, double salary, String[] programmingLanguages) {
        super(name, id, salary);
        this.programmingLanguages = programmingLanguages;
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    @Override
    public String displayUser() {
        // convert array to string and add it to display info
        return super.displayUser() + ". They can code in " + String.join(", ", programmingLanguages);
    }
}

