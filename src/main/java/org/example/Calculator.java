package org.example;

import java.util.OptionalInt;
import java.util.Scanner;


//public class org.example.Calculator {
//    public static void main (String[] args) {
//
//        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//
//        System.out.println("Enter number:");
//        int value1 = myObj.nextLine();
//
//        System.out.println("Enter operation:");
//        string operation = myObj.nextLine();  // Read user input as string
//
//        System.out.println("Enter number");
//        int value2 = myObj.nextLine();
//
//        if (operation.equals("+")){
//            return value1 + value2;
//        }
//    }
//}

//public class org.example.Calculator {
//    public static void main (String[] args) {
//
//        Scanner myObj = new Scanner(System.in);
//        // research scanner object
//
//        System.out.println("Enter a number:");
//        int value1 = Integer.parseInt(myObj.nextLine());
//        // need to convert user input to int from string
//
//        System.out.println("Enter operation +, -, /, *:");
//        String operation = myObj.nextLine();
//        // Read user input as string
//
//        System.out.println("Enter a number");
//        int value2 = Integer.parseInt(myObj.nextLine());
//
//        int result = 0;
//        // initially just returned the statements rather than create a variable
//
//        if (operation.equals("+"))
//        {
//            result = value1 + value2;
//        }
//        else if (operation.equals("-"))
//        {
//            result = value1 - value2;
//        }
//        else if (operation.equals("*"))
//        {
//            result = value1 * value2;
//        }
//        else if (operation.equals("/")) {
//            if (value1 != 0 && value2 != 0) {
//                result = value1 / value2;
//            }
//            else
//            {
//                System.out.println("Cannot divide by zero!");
//                new org.example.Calculator();
//                // need to make this cont not break
//            }
//        }
//        else {
//            System.out.println("Invalid operation");
//            new org.example.Calculator();
//        }
//
//        System.out.println(result);
//    }
//}

public class Calculator {

    static OptionalInt previousResult = OptionalInt.empty();
    // moved this to the class to create a static level field can now be used throughout code
    // as opposed to stuck within inputval method

    static int inputVal() {
        Scanner myObj = new Scanner(System.in);
        int value1;
        // previousResult starts as empty hence isPresent is false
        if (previousResult.isPresent()) {
            System.out.print("Enter a number, or type PREVIOUS to use last result: ");
            String input = myObj.nextLine();
            // as is present is true there is a value present which we retrieve in the below statement
            // retrieve value of ispresent and then store in value1
            if (input.equals("PREVIOUS")) {
                value1 = previousResult.getAsInt();
            } else {
                value1 = Integer.parseInt(input);
                // if they didn't want previous we are converting their input
            }
        } else {
            System.out.print("Enter a number: ");
            value1 = Integer.parseInt(myObj.nextLine());
            // if there is no previous value present and isPresent is false we just ask them for a val
        }

        return value1;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        while (true) {
            // Get first value
            int value1 = inputVal();

            // Get operation
            System.out.print("Enter operation +, -, /, *: ");
            String operation = myObj.nextLine();
            // Read user input as string

            // Get second value
            int value2 = inputVal();

            int result = 0;
            // initially just returned the statements rather than create a variable
            boolean error = false;

            // Perform operation
            switch (operation) {
                case "+" -> result = value1 + value2;
                case "-" -> result = value1 - value2;
                case "*" -> result = value1 * value2;
                case "/" -> {
                    if (value2 != 0) {
                        result = value1 / value2;
                    } else {
                        System.out.println("Cannot divide by zero!");
                        error = true;
                        // if second value is 0 error is true
                    }
                }
                default -> {
                    System.out.println("Invalid operation");
                    error = true;
                    // if wrong operation inputted then error is true
                }
            }

            // if there is no error then we reveal the result
            if (!error) {
                System.out.println("Result: " + result);
                previousResult = OptionalInt.of(result);
            } else {
                previousResult = OptionalInt.empty();
                // leaves box as empty when error is true
                // included the error variable to ensure the code does not break every time 0 is returned
                // some scenarios such as 13-13 can result in 0 which is not incorrect
            }

            // Ask to continue
            System.out.print("Would you like to continue (y/n)? ");
            if (!myObj.nextLine().equalsIgnoreCase("y")) {
                System.out.println("Bye");
                break;
            }
        }
    }
}
