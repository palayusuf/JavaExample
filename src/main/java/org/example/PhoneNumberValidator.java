package org.example;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PhoneNumberValidator {

    String phoneNumberRegex = "^(\\+90|0)?[5-9]\\d{9}$";
    Pattern pattern;

    // Yapıcı (constructor) metod, regex pattern'ini derler
    public PhoneNumberValidator() {
        this.pattern = Pattern.compile(phoneNumberRegex);
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
