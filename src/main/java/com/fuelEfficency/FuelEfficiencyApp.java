package com.fuelEfficency;

import com.fuelEfficency.classes.*;
import com.fuelEfficency.controllers.*;

public class FuelEfficiencyApp {
    static void main() {
        ReceiptDataSet dataSet = SaveManager.loadReceipts();
        while (Menu.mainMenu(dataSet)) ;
        SaveManager.saveReceipts(dataSet);
    }
}