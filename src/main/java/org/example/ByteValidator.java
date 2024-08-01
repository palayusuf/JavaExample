package org.example;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class ByteValidator {
    String charsetName;

    public ByteValidator(String charsetName) {
        this.charsetName = charsetName;
    }

    public boolean isValidByteArray(byte[] byteArray) {
        if (!Charset.isSupported(charsetName)) {
            return false;
        }

        Charset charset = Charset.forName(charsetName);
        CharsetDecoder decoder = charset.newDecoder();

        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        CharBuffer charBuffer = CharBuffer.allocate(byteArray.length);

        boolean isError = decoder.decode(byteBuffer, charBuffer, true).isError();

        return !isError;
    }
}
