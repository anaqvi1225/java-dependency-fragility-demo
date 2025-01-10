// Main.java
package com.juiceshop;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> juiceMenu = new ArrayList<>();

        System.out.println("Welcome to Juice Shop!");

        // Initialize the juice menu
        juiceMenu.add("Apple");
        juiceMenu.add("Orange");
        juiceMenu.add("Grape");
        juiceMenu.add("Mango");

        // Display the juice menu
        System.out.println("Available Juices:");
        for (int i = 0; i < juiceMenu.size(); i++) {
            System.out.println((i + 1) + ". " + juiceMenu.get(i));
        }

        // Prompt user for juice selection
        System.out.println("Enter the number of your preferred juice flavor:");
        String userInput = scanner.nextLine();

        // Validate the input
        if (NumberUtils.isDigits(userInput)) {
            int choice = Integer.parseInt(userInput);
            if (choice > 0 && choice <= juiceMenu.size()) {
                String selectedJuice = juiceMenu.get(choice - 1);

                // Sanitize the selected juice name using StringUtils
                String sanitizedJuice = StringUtils.stripEnd(selectedJuice, null);
                System.out.println("You selected: " + sanitizedJuice.trim() + " juice!");
            } else {
                System.out.println("Invalid selection. Please select a valid juice number.");
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }

        // Additional functionality: Juice of the Day
        String juiceOfTheDay = "Pineapple";
        String reversedJuice = StringUtils.reverse(juiceOfTheDay);
        System.out.println("Juice of the Day: " + juiceOfTheDay);
        System.out.println("(Hint: Can you guess this reversed? " + reversedJuice + ")");

        // Close scanner
        scanner.close();

        System.out.println("Thank you for visiting Juice Shop!");
    }
}


