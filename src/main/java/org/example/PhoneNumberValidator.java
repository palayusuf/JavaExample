package org.example;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PhoneNumberValidator {

    String phoneNumberRegex = "^(\\+90|0)?(5[0-9]{9}|[23489][0-9]{9})$";
    Pattern pattern;

    public PhoneNumberValidator() {
        this.pattern = Pattern.compile(phoneNumberRegex);
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
