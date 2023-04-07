package Concrete;
import Entities.*;

import java.util.ArrayList;

import Abstract.VehicleService;

public class VehicleManager implements VehicleService {
    // Gise Sinifi
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    
    public void payBridgeToll(Vehicle vehicle) {
        vehicle.setBalance(vehicle.getBalance()- vehicle.getPayBridgeToll());
        vehicles.add(vehicle);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

}

