package Concrete;

import Abstract.BaseVehicleManager;
import Entities.Vehicle;

public class MinibusManager extends BaseVehicleManager {
    private int MinibusBridgeToll = 90;
    @Override
    public void payBridgeToll(Vehicle vehicle) {
        vehicle.setBalance(vehicle.getBalance() - MinibusBridgeToll);
        super.payBridgeToll(vehicle);
        super.setTotalBalance(MinibusBridgeToll);
    }
}
