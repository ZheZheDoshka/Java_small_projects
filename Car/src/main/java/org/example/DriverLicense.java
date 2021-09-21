package org.example;

import org.example.enums.LicenseTypes;

import java.time.LocalDate;

public interface DriverLicense {
    LocalDate fromDate();
    LocalDate expires();
    LicenseTypes type();
}
