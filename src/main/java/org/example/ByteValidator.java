package org.example;

public class ByteValidator {

    // Geçerli karakterleri saklamak için kullanılan özellik
    public String validCharacters;

    // Constructor ile validCharacters özelliğini başlatıyoruz
    public ByteValidator(String validCharacters) {
        this.validCharacters = validCharacters;
    }

    // Byte dizisini geçerli karakterlerle karşılaştıran örnek metot
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
