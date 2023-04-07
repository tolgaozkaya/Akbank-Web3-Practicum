import Concrete.Management;
import Concrete.VehicleManager;
import Entities.*;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        VehicleManager baseVehicleManager = new VehicleManager();

        //Gecen Araclar
        baseVehicleManager.payBridgeToll(new Bus(312, "2387289", "06 TA 4533", "Tolga", "Ozkaya", LocalDateTime.of(2022, Month.NOVEMBER, 3, 4, 5, 45), 645));
        baseVehicleManager.payBridgeToll(new Bus(314, "2390284", "06 YZ 6454", "Tolga", "Ozkaya", LocalDateTime.of(2022, Month.NOVEMBER, 3, 4, 5, 45), 960));

        baseVehicleManager.payBridgeToll(new Minibus(123, "2536664", "06 HA 1234", "Tolga", "Ozkaya", LocalDateTime.of(2022, Month.NOVEMBER, 3, 4, 5, 45), 670));
        baseVehicleManager.payBridgeToll(new Minibus(124, "1235437", "34 BT 3979", "Tolga", "Ozkaya", LocalDateTime.of(2022, Month.NOVEMBER, 3, 4, 5, 45), 380));

        baseVehicleManager.payBridgeToll(new Car(225, "4564364", "34 RZ 7698", "Tolga", "Ozkaya", LocalDateTime.of(2022, Month.NOVEMBER, 3, 4, 5, 45), 710));
        baseVehicleManager.payBridgeToll(new Car(226, "3495937", "06 AZ 4564", "Tolga", "Ozkaya", LocalDateTime.of(2022, Month.NOVEMBER, 3, 4, 5, 45), 690));

        
        Management management = new Management();
        ArrayList<Vehicle> vehicleArrayList = baseVehicleManager.getVehicles() ;

        for (int i = 0; i < vehicleArrayList.size(); i++) {
            System.out.println(vehicleArrayList.get(i).getLicensePlate()+", "+ vehicleArrayList.get(i).getPayBridgeToll()+ " TL"+ ", "+vehicleArrayList.get(i).getVehicleType());
        }

        management.TotalBalance(vehicleArrayList);

    }
}
