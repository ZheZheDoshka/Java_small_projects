package org.example;

import org.example.enums.FuelTypes;
import org.example.enums.LicenseTypes;

public class Car implements RefullerAccess, DriverAccess{
    private FuelTypes fuelType;
    private LicenseTypes type;
    private Driver driver;

    public Car(FuelTypes fuelType, LicenseTypes type, Driver driver) {
        this.fuelType = fuelType;
        this.type = type;
        this.driver = driver;
    }

    @Override
    public FuelTypes fuel() {
        return fuelType;
    }

    @Override
    public LicenseTypes driverType() {
        return type;
    }

    public Driver getDriver() {
        return driver;
    }

    public FuelTypes getFuelType() {
        return fuelType;
    }

    public LicenseTypes getType() {
        return type;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setFuelType(FuelTypes fuelType) {
        this.fuelType = fuelType;
    }

    public void setType(LicenseTypes type) {
        this.type = type;
    }
}
