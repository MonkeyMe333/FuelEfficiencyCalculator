package com.fuelEfficency.classes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReceiptDataSet {
    public static final Map<Integer, Receipt> allReceipts = new LinkedHashMap<>();

    public ReceiptDataSet(List<Receipt> receiptList) {
    }

    public ReceiptDataSet() {
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
