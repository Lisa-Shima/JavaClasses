import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Primitive types
//        int age  = 30, temperature = 20; // not good approach
//        age = 35;
//        System.out.println(age);
//        byte age = 30;
//        long viewsCount = 3_123_456_789L;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isEligible = false;
//        byte age = 30;

//        Reference types
//        Date now = new Date();
////        now.getTime();
//        System.out.println(now);

//        Primitve vs reference types
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y);
//        Point point1 = new Point(1, 1);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);

//        Strings
//        String message = new String("Hello Wordl");
//        String message = "Hello World" + "!!";
//        System.out.println(message);
//        System.out.println(message.endsWith("!!"));
//        System.out.println(message.startsWith("!!"));
//        System.out.println(message.length());
//        System.out.println(message.indexOf("sky")); returns -1
//        System.out.println(message.replace("!", "*")); // doesn't change the original string
//        System.out.println(message);
//        String message = "Hello \"Mosh\"";
//        System.out.println(message);
//        String message = "c:\\Windows\\...";
//        System.out.println(message);

//        Arrays
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        System.out.println(Arrays.toString(numbers));
//        int[] numbers = {2, 3, 5, 1, 4};
////        System.out.println(numbers.length);
//        Arrays.sort(numbers);

//        Multi-dimensional
//        int[][] numbers = new int[2][3];
//        numbers[0][0] = 1;
//        System.out.println(Arrays.deepToString(numbers)); // deepToString is used to print multidimensional arrays
//        int[][] numbers = { {1, 2, 3}, {4, 5, 6} };
//        System.out.println(Arrays.deepToString(numbers));

//        Contants
//        final float PI = 3.14F;

//        Arithmetic expressions
//        double result = (double)10 / (double)3;
//        System.out.println(result);
//        int x = 1;
////        int y = x++;
//        int y = ++x;
//        System.out.println(x);
//        System.out.println(y);

//        Order of operations
//        int x = 10 + 3 *2;
//        System.out.println(x); //BODMAS

//        Casting
        // Implicit casting
//        byte > short > int > long > float > double
//        short x = 1;
//        int y = x + 2;
//        System.out.println(y);
        // Explicit casting (only on comparable types)
//        double x = 1.1;
//        int y = (int)x + 2;
//        System.out.println(y);
        // Wrapper classes e.g Integer.parseInt takes string and parses it into an int
//        String x = "1";
//        int y = Integer.parseInt(x) + 2;
//        System.out.println(y);

//        The Math class
//        int result = Math.round(1.1F); // This will be 1
//        int result1 = (int)Math.ceil(1.1F); // Because ceil function returns a double // result will be 2
//        int result2 = (int)Math.floor(1.1F); // This also returns a double // result will be 1
        // We have many other methods like max, min,
//        double result3 = Math.random() * 100; // returns random numbers between 0 and 1 // this method also returns a double and *100 means number btn 0 and 100
//        System.out.println(result1);

//        Formatting numbers
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.891);
//        System.out.println(result);
        // We have other methods for formatting like getPercentInstance()
        // Method Chaining: NumberFormat.getCurrencyInstance().format(1234567.891);

//        Reading inputs
//        Scanner scanner = new Scanner(System.in);
//        byte age = scanner.nextByte();
//        String name = scanner.next(); // we use nextLine to capture all names if entered more than 1

//        Mortgage calculator
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner  = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextInt();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

//        Control flow

    }
}