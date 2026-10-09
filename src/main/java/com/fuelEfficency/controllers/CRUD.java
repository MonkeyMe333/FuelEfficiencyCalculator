package com.fuelEfficency.controllers;

import com.fuelEfficency.classes.ReceiptDataSet;

import java.time.LocalDate;

public class CRUD {
    public static void createReceipt(ReceiptDataSet dataSet) {
        double volume = Menu.getDouble("Volume in Litres");
        double price = Menu.getDouble("Price in Dollars");
        LocalDate date = Menu.getDate();
        dataSet.addReceipt(volume, price, date);
    }

    public static void readReceipts(ReceiptDataSet dataSet) {
        dataSet.getAll().forEach((id, receipt) ->
                IO.println("Id: " + id + "\t| "+ receipt.toString())
        );
    }

    public static void updateReceipt(ReceiptDataSet dataSet) {
        int id;
        while (true) {
            id = Menu.getInt("Id", dataSet.getLastKey());
            if (dataSet.getAll().containsKey(id))
                break;
            IO.println("Id dose not exist");
        }
        double volume = Menu.getDouble("Volume in Litres");
        double price = Menu.getDouble("Price in Dollars");
        LocalDate date = Menu.getDate();
        dataSet.addReceipt(id, volume, price, date);
    }

    public static void deleteReceipt(ReceiptDataSet dataSet) {
        int id = Menu.getInt("Id", dataSet.getLastKey());
        if (!dataSet.getAll().containsKey(id))
            IO.println("Id dose not exist");
        else
            dataSet.removeReceipt(id);
    }
}