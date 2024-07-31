package org.example;

public class ByteValidator {
    public static boolean isValidByteArray(byte[] byteArray, String validCharacters) {
        for (byte b : byteArray) {
            char c = (char) b;
            if (validCharacters.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
