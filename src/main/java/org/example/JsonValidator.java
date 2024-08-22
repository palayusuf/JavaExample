package org.example;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class JsonValidator {

    private final URLValidator urlValidator;
    private final PhoneNumberValidator phoneNumberValidator;

    public JsonValidator() {
        this.urlValidator = new URLValidator();
        this.phoneNumberValidator = new PhoneNumberValidator();
    }

    public boolean validate(String jsonData) {
        try {
            JSONArray jsonArray = new JSONArray(jsonData);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String url = jsonObject.optString("url", null);
                String phoneNumber = jsonObject.optString("phoneNumber", null);

                if (url == null || !urlValidator.validate(url)) {
                    throw new IllegalArgumentException("Invalid URL: " + url);
                }

                if (phoneNumber == null || !phoneNumberValidator.validate(phoneNumber)) {
                    throw new IllegalArgumentException("Invalid phone number: " + phoneNumber);
                }
            }
            return true;
        } catch (JSONException e) {
            throw new RuntimeException("Invalid JSON data: " + e.getMessage());
        }
    }
}
