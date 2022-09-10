package Abstract;

import Concrete.BusManager;
import Entities.Vehicle;

import java.util.ArrayList;

public abstract class BaseVehicleManager implements VehicleService {
    private int TotalBalance;
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    @Override
    public void payBridgeToll(Vehicle vehicle) {
        addToList(vehicle);
    }

    public void addToList(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public int getTotalBalance() {
        return TotalBalance;
    }

    public void setTotalBalance(int BridgeToll) {
        TotalBalance = BridgeToll + TotalBalance;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }


}
