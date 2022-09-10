import Abstract.BaseVehicleManager;
import Concrete.BusManager;
import Concrete.CarManager;
import Concrete.MinibusManager;
import Entities.Minibus;
import Entities.Vehicle;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BaseVehicleManager busManager = new BusManager();
        BaseVehicleManager carManager = new CarManager();
        BaseVehicleManager minibusManager = new MinibusManager();

        BaseVehicleManager[] baseVehicleManagers = {busManager, minibusManager, carManager};

        //Gecen Araclar
        minibusManager.payBridgeToll(new Vehicle(123, "2536664", "06 HA 1234", "Tolga", "Ozkaya", LocalDateTime.of(2022, Month.NOVEMBER, 3, 4, 5, 45), 670));
        minibusManager.payBridgeToll(new Vehicle(124, "1235437", "34 BT 3979", "Tolga", "Ozkaya", LocalDateTime.of(2022, Month.NOVEMBER, 3, 4, 5, 45), 380));

        carManager.payBridgeToll(new Vehicle(225, "4564364", "34 RZ 7698", "Tolga", "Ozkaya", LocalDateTime.of(2022, Month.NOVEMBER, 3, 4, 5, 45), 710));
        carManager.payBridgeToll(new Vehicle(226, "3495937", "06 AZ 4564", "Tolga", "Ozkaya", LocalDateTime.of(2022, Month.NOVEMBER, 3, 4, 5, 45), 690));

        busManager.payBridgeToll(new Vehicle(312, "2387289", "06 TA 4533", "Tolga", "Ozkaya", LocalDateTime.of(2022, Month.NOVEMBER, 3, 4, 5, 45), 645));
        busManager.payBridgeToll(new Vehicle(314, "2390284", "06 YZ 6454", "Tolga", "Ozkaya", LocalDateTime.of(2022, Month.NOVEMBER, 3, 4, 5, 45), 960));


        Management management = new Management();
        ArrayList<Vehicle> vehicleArrayList = management.getAllVehicles(baseVehicleManagers);

        for (int i = 0; i < vehicleArrayList.size(); i++) {
            System.out.println(vehicleArrayList.get(i).getLicensePlate());
        }

        management.TotalBalance(baseVehicleManagers);

    }
}
