package Abstract;

import Concrete.BusManager;
import Entities.Vehicle;

import java.util.ArrayList;

public abstract class BaseVehicleManager implements VehicleService {
    /* Gise sinifi, gecen araclardan kopru ucretini alan ve toplam kazanci döndüren bir fonksiyon bulunduruyor.
    Ayrica bu araçlarin bir Arraylist'te tutulmasını sagliyor. */

    private int TotalBalance;
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    //Kopru Ucreti Odeme Fonksiyonu
    @Override
    public void payBridgeToll(Vehicle vehicle) {
        addToList(vehicle);
    }

    //ArrayList'e Ekleyen Fonksiyon
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
