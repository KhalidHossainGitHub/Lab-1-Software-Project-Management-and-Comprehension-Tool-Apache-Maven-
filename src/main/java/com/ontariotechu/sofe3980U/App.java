package com.ontariotechu.sofe3980U;

import java.time.LocalTime;
import java.util.Scanner;

public class App {
    public static void main( String[] args )
    {
        // Get current local time and display
        LocalTime currentTime = LocalTime.now();
        System.out.println("The current local time is: " + currentTime);
        
        // Set up the scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Get the first binary number from the user
        System.out.print("Enter the first binary number: ");
        String bin1 = scanner.nextLine();
        Binary binary1 = new Binary(bin1);
        System.out.println("First binary number is: " + binary1.getValue());

        // Get the second binary number from the user
        System.out.print("Enter the second binary number: ");
        String bin2 = scanner.nextLine();
        Binary binary2 = new Binary(bin2);
        System.out.println("Second binary number is: " + binary2.getValue());

        // Perform and display addition
        Binary sum = Binary.add(binary1, binary2);
        System.out.println("The sum is: " + sum.getValue());

        // Perform and display OR operation
        Binary orResult = Binary.OR(binary1, binary2);
        System.out.println("The result of OR operation is: " + orResult.getValue());

        // Perform and display AND operation
        Binary andResult = Binary.AND(binary1, binary2);
        System.out.println("The result of AND operation is: " + andResult.getValue());

        // Perform and display multiplication
        Binary product = Binary.multiply(binary1, binary2);
        System.out.println("The result of multiplication is: " + product.getValue());

        // Close scanner to prevent resource leak
        scanner.close();
    }
}
