package org.example;

import org.example.enums.LicenseTypes;

import java.time.LocalDate;

public class VehicleLicense implements DriverLicense {

    private LocalDate fromDate;
    private LocalDate expires;
    private LicenseTypes type;

    public VehicleLicense(LocalDate fromDate, LocalDate expires, LicenseTypes type) {
        this.fromDate = fromDate;
        this.expires = expires;
        this.type = type;
    }

    @Override
    public LocalDate expires() {
        return expires;
    }

    @Override
    public LocalDate fromDate() {
        return fromDate;
    }


    @Override
    public LicenseTypes type() {
        return type;
    }

    public LocalDate getExpires() {
        return expires;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setExpires(LocalDate expires) {
        this.expires = expires;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }
}
