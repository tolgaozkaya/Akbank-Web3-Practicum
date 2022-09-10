package Concrete;

import Abstract.BaseVehicleManager;
import Entities.Vehicle;

public class BusManager extends BaseVehicleManager {
    private int BusBridgeToll = 120;

    @Override
    public void payBridgeToll(Vehicle vehicle) {
        vehicle.setBalance(vehicle.getBalance() - BusBridgeToll);
        super.payBridgeToll(vehicle);
        super.setTotalBalance(BusBridgeToll);
    }
}
