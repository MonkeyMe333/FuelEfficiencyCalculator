package com.fuelEfficency.controllers;

import com.fuelEfficency.classes.Receipt;
import com.fuelEfficency.classes.ReceiptDataSet;
import java.io.*;
import java.time.LocalDate;
import java.util.Map;

public class SaveManager {
    public static void saveReceipts(ReceiptDataSet dataSet) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("savedata.csv"))) {
	    for (Map.Entry<Integer, Receipt> entry : dataSet.getAll().entrySet()) {
		bufferedWriter.write(
                        entry.getKey() + entry.getValue().getData()
                );
		bufferedWriter.newLine();
	    }
	} catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ReceiptDataSet loadReceipts() {
        ReceiptDataSet dataSet = new ReceiptDataSet();
        File file = new File("savedata.csv");

        if (!file.exists()) {
            return dataSet;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("savedata.csv"))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                double price = Double.parseDouble(data[1]);
                double volume = Double.parseDouble(data[2]);
                LocalDate date = LocalDate.parse(data[3]);

                dataSet.addReceipt(id, volume, price, date);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
	return dataSet;
    }
}
