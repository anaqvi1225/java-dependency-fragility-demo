// Main.java
package com.juiceshop;

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Juice Shop!");

        // Prompt user for juice input
        System.out.println("Enter your favorite juice flavor:");
        String juiceFlavor = scanner.nextLine();

        // Sanitize user input using StringUtils (with deprecated method)
        String sanitizedFlavor = StringUtils.stripEnd(juiceFlavor, null);
        System.out.println("You selected: " + sanitizedFlavor.trim() + " juice!");

        // Demonstrate dependency functionality
        System.out.println("Processing your juice order...");
        System.out.println("Juice flavor length: " + StringUtils.length(sanitizedFlavor));

        // Close scanner
        scanner.close();

        System.out.println("Thank you for visiting Juice Shop!");
    }
}


