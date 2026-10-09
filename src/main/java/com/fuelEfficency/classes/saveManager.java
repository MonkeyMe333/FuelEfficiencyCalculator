package com.fuelEfficency.classes;

import java.io.FileWriter;
import java.io.IOException;

public class saveManager {
    public void saveInventory(receiptDataSet dataSet) {
        try (FileWriter writer = new FileWriter("savedata.txt")) {

            for (receipt receipt : dataSet.getReceiptList().values()) {
                writer.write(
                        receipt.getId() + "," +
                                receipt.getPrice() + "," +
                                receipt.getVolume() + "," +
                                receipt.getDate() + "\n"
                );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
