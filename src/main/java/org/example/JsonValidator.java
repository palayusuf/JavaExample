package org.example;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class JsonValidator {
    private final Map<String, Validator> validators;

    public JsonValidator(Map<String, Validator> validators) {
        this.validators = validators;
    }

    public void validateJsonFile(String filePath) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(filePath)));

        JSONArray jsonArray = new JSONArray(content);

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);

            for (Map.Entry<String, Validator> entry : validators.entrySet()) {
                String field = entry.getKey();
                Validator validator = entry.getValue();

                if (jsonObject.has(field)) {
                    String value = jsonObject.getString(field);
                    boolean isValid = validator.validate(value);
                    if (!isValid) {
                        throw new IllegalArgumentException("Field: " + field + " has an invalid value: " + value + ". Please provide a valid " + field + ".");
                    }
                    System.out.println("Field: " + field + ", Value: " + value + ", Valid: " + isValid);
                } else {
                    throw new IllegalArgumentException("Field: " + field + " is missing. Please provide the " + field + " field.");
                }
            }
        }
    }
}
