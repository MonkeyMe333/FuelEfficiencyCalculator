package com.fuelEfficency.classes;

import java.time.LocalDate;

public class Receipt {
    private int id;
    private double volume; //    In Litres
    private double price;
    private LocalDate Date;

    public Receipt() {
    }

    public Receipt(int id, double volume, double price, LocalDate date) {
	this.id = id;
	this.volume = volume;
	this.price = price;
	Date = date;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public double getVolume() {
	return volume;
    }

    public void setVolume(double volume) {
	this.volume = volume;
    }

    public double getPrice() {
	return price;
    }

    public void setPrice(double price) {
	this.price = price;
    }

    public LocalDate getDate() {
	return Date;
    }

    public void setDate(LocalDate date) {
	Date = date;
    }

    public String getData() {
	return id+','+volume+','+price+','+Date.toString();
    }
}
