package com.fuelEfficency;

import java.util.Scanner;

public class Main {

    private final Scanner scanner = new Scanner(System.in);

    public void openMainMenu() {


        boolean running = true;

        while (running) {
            System.out.println("\n Main Menu");
            System.out.println("1. Add Receipt");
            System.out.println("2. Remove Receipt");
            System.out.println("3. Update Receipt");
            System.out.println("4. View all Receipts");


            String choice = scanner.nextLine();
        }
    }
}
