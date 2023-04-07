package Entities;

import java.time.LocalDateTime;

public class Car extends Vehicle {

    public Car(int id, String HGS_number, String licensePlate, String vehicleOwnerFirstName,
            String vehicleOwnerLastName, LocalDateTime date, int balance) {
        super(id, HGS_number, licensePlate, vehicleOwnerFirstName, vehicleOwnerLastName, date, balance, "Car", 60);
    }

}
