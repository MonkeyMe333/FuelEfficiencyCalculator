package com.fuelEfficency.classes;

import java.util.List;

public class receiptDataSet {
    private int id;
    private List<receipt> receiptList;

    public receiptDataSet(int id, List<receipt> receiptList) {
	this.id = id;
	this.receiptList = receiptList;
    }

    public receiptDataSet() {
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public List<receipt> getReceiptList() {
	return receiptList;
    }

    public void setReceiptList(List<receipt> receiptList) {
	this.receiptList = receiptList;
    }
}
