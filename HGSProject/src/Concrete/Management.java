package Concrete;
import Entities.Vehicle;

import java.util.ArrayList;

public class Management {
    int TotalBalance;

    public void TotalBalance(ArrayList<Vehicle> allVehicles) {
        for (Vehicle vehicle : allVehicles) {
            TotalBalance = vehicle.getPayBridgeToll() + TotalBalance;
        }
        System.out.println("Total Balance: " + TotalBalance + " TL");
    }

}
