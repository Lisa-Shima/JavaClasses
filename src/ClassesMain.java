import classes.Car;
import classes.NegativeNumberException;
import classes.Pokemon;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
import java.util.Scanner;

public class ClassesMain {
    public static void main(String[] args){
        // Classes
        Pokemon p1 = new Pokemon();
        p1.name = "Pikachu";
        p1.level = 10;
        p1.attack();

        Car car1 = new Car("Toyota", "Corola", 2015);
        car1.displayDetails();

//         Collections
        // ArrayList
        ArrayList<String> students = new ArrayList<>();
        students.add("Lisa");
        students.add("John");
        students.add("Maria");
        students.add("Alex");

        System.out.println("Students: " + students);

        students.remove("Maria");

        // HashMap
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Lisa", "123-456-7890");
        phoneBook.put("John", "987-654-3210");
        phoneBook.put("Maria", "555-123-4567");

        System.out.println("PhoneBook: " + phoneBook);
        phoneBook.remove("Maria");

        // HashSet

        // File I/O
        String filename = "example.txt";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            writer.write("Hello Java I/O");
            writer.newLine();
            writer.write("You're doing great, Lisa");
            System.out.println("File written successfully");
        }
        catch (IOException e){
            System.out.println("Error occured while writing on the file, "+e.getMessage());
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("Error occured while reading the file, "+e.getMessage());
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            writer.newLine();
            writer.write("I have appended a new text");
            System.out.println("Text appended successfully");
        }
        catch(IOException e){
            System.out.println("Error occured in appending new text to the file, "+e.getMessage());
        }

        // Exception

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter the first number: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the second number: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            int result = num1 / num2;
            System.out.println("Result = "+ result);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed");
        }
        catch(NumberFormatException e){
            System.out.println("Error: Invalid input. Enter a valid input");
        }
        finally {
            System.out.println("Thank you for using the program");
        }


            //custom
        try{
            System.out.println("Enter a positive number");
            int number = Integer.parseInt(scanner.nextLine());

            if(number < 0){
                throw new NegativeNumberException("Error: Negative number entered!");
            }
            System.out.println("You entered: "+number);
        }
        catch(NegativeNumberException e){
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Error: Invalid number. Please enter a valid number"+ e.getMessage());
        }
        finally {
            System.out.println("Thank you for using the program");
        }

        scanner.close();
    }
}
