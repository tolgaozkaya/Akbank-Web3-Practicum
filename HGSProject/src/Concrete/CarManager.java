package Concrete;

import Abstract.BaseVehicleManager;
import Entities.Vehicle;

public class CarManager extends BaseVehicleManager {
    private int CarBridgeToll = 60;

    @Override
    public void payBridgeToll(Vehicle vehicle) {
        vehicle.setBalance(vehicle.getBalance() - CarBridgeToll);
        super.payBridgeToll(vehicle);
        super.setTotalBalance(CarBridgeToll);
    }
}
