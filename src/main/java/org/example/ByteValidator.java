package org.example;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.UnsupportedCharsetException;

public class ByteValidator {
    String charsetName;

    public ByteValidator(String charsetName) {
        this.charsetName = charsetName;
    }

    public boolean isValidByteArray(byte[] byteArray) {
        if (!Charset.isSupported(charsetName)) {
            throw new UnsupportedCharsetException("Unsupported charset: " + charsetName);
        }

        Charset charset = Charset.forName(charsetName);
        CharsetDecoder decoder = charset.newDecoder();

        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        CharBuffer charBuffer = CharBuffer.allocate(byteArray.length);

        boolean isError = decoder.decode(byteBuffer, charBuffer, true).isError();

        return !isError;
    }
}
