package com.fuelEfficency.classes;

import java.time.LocalDate;
import java.util.*;

public class ReceiptDataSet {
    private final NavigableMap<Integer, Receipt> dataSet = new TreeMap<>();

    public ReceiptDataSet() {
    }

    public void addReceipt(double volume, double price, LocalDate date) {
        addReceipt(getLastKey() + 1, volume, price, date);
    }

    public void addReceipt(int id, double volume, double price, LocalDate date) {
        dataSet.put(id, new Receipt(volume, price, date));
    }

    public void removeReceipt(int id) {
        dataSet.remove(id);
    }

    public Map<Integer, Receipt> getAll() {
        return dataSet;
    }
    public int getLastKey() {
        try {
            return dataSet.lastKey();
        } catch (NoSuchElementException e) {
            return 0;
        }
    }
}