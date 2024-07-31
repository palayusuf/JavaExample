package org.example;

public class ByteValidator {

    public String validCharacters;

    public ByteValidator(String validCharacters) {
        this.validCharacters = validCharacters;
    }

    public boolean isValidByteArray(byte[] byteArray) {
        for (byte b : byteArray) {
            char c = (char) b;
            if (validCharacters.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
