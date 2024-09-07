import java.util.OptionalInt;
import java.util.Scanner;


//public class Calculator {
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

//public class Calculator {
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
//                new Calculator();
//                // need to make this cont not break
//            }
//        }
//        else {
//            System.out.println("Invalid operation");
//            new Calculator();
//        }
//
//        System.out.println(result);
//    }
//}

public class Calculator {
    public static void main (String[] args) {

        Scanner myObj = new Scanner(System.in);
        // research scanner object

        OptionalInt previousResult = OptionalInt.empty();

        while (true) {
            int value1;
            // previousResult starts as empty hence isPresent is false
            if(previousResult.isPresent()){
                System.out.print("Enter a number, or type PREVIOUS to use last result: ");
                String input = myObj.nextLine();
                if(input.equals("PREVIOUS")){
                    // as is present is true there is a value present which we retrieve in the below statement
                    value1 = previousResult.getAsInt();
                }
                else{
                    value1 = Integer.parseInt(input);
                    // if they didn't want previous we are converting their input
                }
            }
            else{
                System.out.print("Enter a number: ");
                value1 = Integer.parseInt(myObj.nextLine());
                // if there is no previous value present and isPresent is false we just ask them for a val
            }

            System.out.print("Enter operation +, -, /, *: ");
            String operation = myObj.nextLine();
            // Read user input as string

            int value2;
            if(previousResult.isPresent()){
                System.out.print("Enter a number, or type PREVIOUS to use last result: ");
                String input = myObj.nextLine();
                if(input.equals("PREVIOUS")){
                    value2 = previousResult.getAsInt();
                }
                else{
                    value2 = Integer.parseInt(input);
                }
            }
            else{
                System.out.print("Enter a number: ");
                value2 = Integer.parseInt(myObj.nextLine());
            }

            int result = 0;
            // initially just returned the statements rather than create a variable

            boolean error = false;

            switch (operation) {
                case "+" -> result = value1 + value2;
                // what does arrow do thought it would be curly braces
                case "-" -> result = value1 - value2;
                case "*" -> result = value1 * value2;
                case "/" -> {
                    if (value2 != 0) {
                        result = value1 / value2;
                    } else {
                        System.out.println("Cannot divide by zero!");
                        // need to make this cont not break
                        error = true;
                    }
                }
                default -> {
                    System.out.println("Invalid operation");
                    error = true;
                }
            }
            // if there is no error then we reveal the result
            if (!error){
                System.out.println("Result: " + result);
                previousResult = OptionalInt.of(result); // captures result into a box
            }
            else{
                previousResult = OptionalInt.empty(); // leaves box as empty when error is true
                // included the error variable to ensure the code does not break every time 0 is returned
                // some scenarios such as 13-13 can result in 0 which is not incorrect
            }
            System.out.print("Would you like to continue (y/n)? ");
            if (!myObj.nextLine().equals("y")){
                System.out.println("Bye");
                break;
            }
        }
    }
}



// add user input to continue - while loop
// use answer from before as one of the next values
// switch statement
// should I account for decimals

// extract 87-105 place into method and just call method again for val 2
