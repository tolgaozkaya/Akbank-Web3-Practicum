import Abstract.BaseVehicleManager;
import Entities.Vehicle;

import java.util.ArrayList;

public class Management {
    int VehicleTotalBalance;
    ArrayList<Vehicle> allVehicles= new ArrayList<>();

    /* Yonetim Sinifi, geçen tum araclardan elde edilen kazanci gosteren ve
    bu araçların listesini döndüren fonksiyonları tutuyor.*/

    public void TotalBalance(BaseVehicleManager[] baseVehicleManagers) {
        for (BaseVehicleManager baseVehicleManager : baseVehicleManagers) {
            VehicleTotalBalance = baseVehicleManager.getTotalBalance() + VehicleTotalBalance;
        }
        System.out.println("Total Balance:"+ VehicleTotalBalance);
    }

    public ArrayList<Vehicle> getAllVehicles(BaseVehicleManager[] baseVehicleManagers){
        for (BaseVehicleManager baseVehicleManager : baseVehicleManagers) {
            allVehicles.addAll(baseVehicleManager.getVehicles());
        }
        return allVehicles;
    }

}
