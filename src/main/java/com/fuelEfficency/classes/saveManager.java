package com.fuelEfficency.classes;

import java.io.*;
import java.sql.Date;

import static com.fuelEfficency.classes.receiptDataSet.allReceipts;

public class saveManager {
    public void saveReceipts(receiptDataSet dataSet) {
        try (FileWriter writer = new FileWriter("savedata.txt")) {

            for (receipt receipt : allReceipts.values()) {
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


    public void loadReceipts() {
        File file = new File("savedata.txt");

        if (!file.exists()) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("savedata.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                double price = Double.parseDouble(data[1]);
                double volume = Double.parseDouble(data[2]);
                Date date = Date.valueOf(data[3]);


                receipt receipt =
                        new receipt(id, volume, price, date.toLocalDate());

                allReceipts.put(id, receipt);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
