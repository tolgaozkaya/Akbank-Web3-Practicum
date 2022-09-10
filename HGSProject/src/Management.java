import Abstract.BaseVehicleManager;
import Entities.Vehicle;

import java.util.ArrayList;

public class Management {
    int VehicleTotalBalance;
    ArrayList<Vehicle> allVehicles = new ArrayList<>();

    public void TotalBalance(BaseVehicleManager[] baseVehicleManagers) {
        for (BaseVehicleManager baseVehicleManager : baseVehicleManagers) {
            VehicleTotalBalance = baseVehicleManager.getTotalBalance() + VehicleTotalBalance;
        }
        System.out.println("Total Balance:" + VehicleTotalBalance);
    }

    public ArrayList<Vehicle> getAllVehicles(BaseVehicleManager[] baseVehicleManagers) {
        for (BaseVehicleManager baseVehicleManager : baseVehicleManagers) {
            allVehicles.addAll(baseVehicleManager.getVehicles());
        }
        return allVehicles;
    }

}
