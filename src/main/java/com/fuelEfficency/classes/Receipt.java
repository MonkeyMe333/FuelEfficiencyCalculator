package com.fuelEfficency.classes;

import java.time.LocalDate;

public class Receipt {
    private final double volume;
    private final double price;
    private final double distance; // distance traveled since last fill in km
    private final LocalDate Date;

    public Receipt(double volume, double price, double distance, LocalDate date) {
	this.volume = volume;
	this.price = price;
	this.distance = distance;
	Date = date;
    }

    public double getVolume() {
	return volume;
    }
    public double getPrice() {
	return price;
    }
    public double getDistance() {
	return distance;
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

    public double getKmPerLitre() {
	return distance / volume;
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
    public String getRoundedKmPerLitre() {
	return String.format("%.2f", getKmPerLitre()) + "km/L";

    }

    @Override
    public String toString() {
	return getRoundedVolume() + " | " + getRoundedPrice() + " | " + getRoundedPricePerLitre() + " | " + getRoundedKmPerLitre();
    }
}
