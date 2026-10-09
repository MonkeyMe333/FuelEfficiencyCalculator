package com.fuelEfficency.classes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReceiptDataSet {
    private int id;
    public static final Map<Integer, Receipt> allReceipts = new LinkedHashMap<>();

    public ReceiptDataSet(int id, List<Receipt> receiptList) {
	    this.id = id;
    }

    public ReceiptDataSet() {
    }

    public int getId() {
	    return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public List<String> getAll() {
        ArrayList<String> currentreceipts = new ArrayList<>();
        for (Receipt receipt : allReceipts.values()) {
            if (receipt != null) {
                currentreceipts.add(receipt.toString());
            }
        }
        return currentreceipts;
    }
}
