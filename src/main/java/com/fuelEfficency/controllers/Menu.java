package com.fuelEfficency.controllers;

import com.fuelEfficency.classes.ReceiptDataSet;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static int menu(List<String> menuOptions, String name) {
	IO.println(name);
	for (String option : menuOptions)
	    IO.println(option);
	return getInt(name, menuOptions.size());
    }

    public static boolean mainMenu(ReceiptDataSet dataSet) {
	final List<String> menuOptions = List.of(
		"1. Add Product",
		"2. Remove Product",
		"3. Update Product",
		"4. View All Products",
		"0. Quit"
	);
	return switch (menu(menuOptions, "Main Menu")) {
	    case 1 -> {
		CRUD.createReceipt(dataSet);
		yield true;
	    }
	    case 2 -> {
		CRUD.updateReceipt(dataSet);
		yield true;
	    }
	    case 3 -> {
		CRUD.deleteReceipt(dataSet);
		yield true;
	    }
	    case 4 -> {
		CRUD.readReceipts(dataSet);
		yield true;
	    }
	    default -> false;
        };
    }

    public static int getInt(String name, int max) {
	while (true)
	    try {
		int value = Integer.parseInt(getString(name));
		if (value >= 0 && value <= max)
		    return value;

		IO.println(name + "must be in the range 0 - " + max);
	    } catch (NumberFormatException e) {
		IO.println("Invalid Integer");
	    }
    }

    public static double getDouble(String name) {
	while (true)
	    try {
		double value = Double.parseDouble(getString(name));
		if (value > 0)
		    return value;

		IO.println(name + "Must be greater then 0");
	    } catch (NumberFormatException e) {
		IO.println("Invalid Number");
	    }
    }

    public static LocalDate getDate() {
	while (true) {
	    IO.println("Date must be formated as 'yyyy-mm-dd'");
	    try {
		return LocalDate.parse(getString("Date"));
	    } catch (RuntimeException e) {
		IO.println("Invalid Date");
	    }
	}
    }

    public static String getString(String name) {
	Scanner sc = new Scanner(System.in);
	while (true) {
	    IO.println("Please Input " + name);
	    String value = sc.nextLine();
	    if (!value.isBlank())
		return value;
	    IO.println(name + " Must not be blank");
	}
    }
}
