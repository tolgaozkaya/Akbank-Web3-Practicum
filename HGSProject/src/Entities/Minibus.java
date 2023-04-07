package Entities;

import java.time.LocalDateTime;

public class Minibus extends Vehicle {

    public Minibus(int id, String HGS_number, String licensePlate, String vehicleOwnerFirstName,
            String vehicleOwnerLastName, LocalDateTime date, int balance) {
        super(id, HGS_number, licensePlate, vehicleOwnerFirstName, vehicleOwnerLastName, date, balance, "Minibus", 90);
    }

}
