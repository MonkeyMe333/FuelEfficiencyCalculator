package com.fuelEfficency.classes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class receiptDataSet {
    private int id;
    private final Map<Integer, receipt> allReceipts = new LinkedHashMap<>();

    public receiptDataSet(int id, List<receipt> receiptList) {
	    this.id = id;
    }

    public receiptDataSet() {
    }

    public int getId() {
	    return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public List<String> getAll() {
        ArrayList<String> currentreceipts = new ArrayList<>();
        for (receipt receipt : allReceipts.values()) {
            if (receipt != null) {
                currentreceipts.add(receipt.toString());
            }
        }
        return currentreceipts;
    }
}
