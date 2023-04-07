package Entities;

import java.time.LocalDateTime;

public class Vehicle {
    private int id;
    private String HGS_number;
    private String licensePlate;
    private String vehicleOwnerFirstName;
    private String vehicleOwnerLastName;
    private LocalDateTime date;
    private int balance;
    private String vehicleType;
    int payBridgeToll;

    protected Vehicle(int id, String HGS_number, String licensePlate, String vehicleOwnerFirstName,
            String vehicleOwnerLastName, LocalDateTime date, int balance, String vehicleType,int payBridgeToll) {
        this.id = id;
        this.HGS_number = HGS_number;
        this.vehicleOwnerFirstName = vehicleOwnerFirstName;
        this.vehicleOwnerLastName = vehicleOwnerLastName;
        this.date = date;
        this.balance = balance;
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.payBridgeToll= payBridgeToll;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHGS_number() {
        return HGS_number;
    }

    public void setHGS_number(String HGS_number) {
        this.HGS_number = HGS_number;
    }

    public String getVehicleOwnerFirstName() {
        return vehicleOwnerFirstName;
    }

    public void setVehicleOwnerFirstName(String vehicleOwnerFirstName) {
        this.vehicleOwnerFirstName = vehicleOwnerFirstName;
    }

    public String getVehicleOwnerLastName() {
        return vehicleOwnerLastName;
    }

    public void setVehicleOwnerLastName(String vehicleOwnerLastName) {
        this.vehicleOwnerLastName = vehicleOwnerLastName;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getPayBridgeToll() {
        return payBridgeToll;
    }

    public void setPayBridgeToll(int payBridgeToll) {
        this.payBridgeToll = payBridgeToll;
    }
}
