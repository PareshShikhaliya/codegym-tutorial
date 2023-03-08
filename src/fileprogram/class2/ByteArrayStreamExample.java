package fileprogram.class2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStreamExample {

    public static void main(String[] args) throws IOException {
       // byteArrayInputStreamMethod();

        byteArrayOutputStreamMethod();
    }

    private static void byteArrayOutputStreamMethod() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        String message = "Hello, world!";
        byte[] data = message.getBytes();

        baos.write(data);

        byte[] result = baos.toByteArray();
        String output = new String(result);

        System.out.println(output);

        baos.close();
    }

    /*
    ByteArrayInputStream is a class in Java that allows you to read data from a byte array as if it were
    a stream of bytes. It is a subclass of the InputStream class, which is an abstract class that
     represents an input stream of bytes.

    The ByteArrayInputStream class allows you to create an input stream that reads data from a byte array.
     You can then read bytes from this stream using the read() method, just as you would with any other
     InputStream
     */
    private static void byteArrayInputStreamMethod() {
        byte[] data = { 65};

        ByteArrayInputStream bais = new ByteArrayInputStream(data);

        int nextByte;
        while ((nextByte = bais.read()) != -1) {
            System.out.println((char) nextByte);
        }
    }
}
