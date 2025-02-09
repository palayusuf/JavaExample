package org.example;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IPAddressValidator implements Validator {

    String ipAddressRegex =
            "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    Pattern pattern;

    public IPAddressValidator() {
        this.pattern = Pattern.compile(ipAddressRegex);
    }

    @Override
    public boolean validate(String ipAddress) {
        Matcher matcher = pattern.matcher(ipAddress);
        return matcher.matches();
    }
}
