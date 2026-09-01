package org.example;

import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class JsonValidator {

    private final Map<String, Validator> validators;

    public JsonValidator(Map<String, Validator> validators) {
        this.validators = validators;
    }

    public boolean validate(String jsonFileName) {
        try {
            String jsonData = new String(Files.readAllBytes(Paths.get(jsonFileName)));
            JSONArray jsonArray = new JSONArray(jsonData);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String url = jsonObject.getString("url");
                String phoneNumber = jsonObject.getString("phoneNumber");

                if (!validators.get("url").validate(url)) {
                    return false; // Geçersiz URL
                }

                if (!validators.get("phoneNumber").validate(phoneNumber)) {
                    return false; // Geçersiz telefon numarası
                }
            }
            return true; // Tüm veriler geçerli
        } catch (Exception e) {
            return false; // JSON verisi hatalı
        }
    }
}
