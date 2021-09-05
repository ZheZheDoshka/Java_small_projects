package org.example.Controller;

public interface RegularExpressions {
        String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ]{1}[а-щьюяґіїє']{1,20}|" +
                "[А-ЩЬЮЯҐІЇЄ]{1}[а-щьюяґіїє']{1,20}[-]{1}[А-ЩЬЮЯҐІЇЄ]{1}[а-щьюяґіїє']{1,20}$"; //for double names/surnames
        String REGEX_NAME_LAT = "^[A-Z]{1}[a-z]{1,20}|[A-Z]{1}[a-z]{1,20}[-]{1}[A-Z]{1}[a-z]{1,20}$";
        String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
        String REGEX_PHONE = "^[0-9]{12}$";
}
