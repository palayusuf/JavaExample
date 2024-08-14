package org.example;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class URLValidator {

    String urlRegex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]+[-a-zA-Z0-9+&@#/%=~_|]$";
    Pattern pattern;

    public URLValidator() {
        this.pattern = Pattern.compile(urlRegex);
    }

    public boolean isValidURL(String url) {
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }
}
