package com.fuelEfficency.classes;

import java.time.LocalDate;

public class Receipt {
    private final double volume;
    private final double price;
    private final LocalDate Date;

    public Receipt(double volume, double price, LocalDate date) {
	this.volume = volume;
	this.price = price;
	Date = date;
    }

    public double getVolume() {
	return volume;
    }
    public double getPrice() {
	return price;
    }
    public LocalDate getDate() {
	return Date;
    }

    public String getData() {
	return "," + volume + "," + price + "," + Date;
    }

    public double getPricePerLitre() {
	return price / volume;
    }

    public String getRoundedVolume() {
	return String.format("%.2f", volume) + 'L';
    }
    public String getRoundedPrice() {
	return String.format("%.2f", price) + '$';
    }
    public String getRoundedPricePerLitre() {
	return String.format("%.2f", getPricePerLitre()) + "$/L";
    }

    @Override
    public String toString() {
	return getRoundedVolume() + " | " + getRoundedPrice() + " | " + getRoundedPricePerLitre();
    }
}
