package nioexample;

import java.nio.ByteBuffer;

public class FlipExample {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Write data to the buffer
        buffer.put("hello".getBytes());

        // Prepare the buffer for reading
        /*
        When we run this program, it prints the string "hello" to the console.
         Note that if we didn't call the flip() method before reading from the buffer,
          the position of the buffer would be set to 5 (the end of the data we wrote to the buffer),
           so we wouldn't be able to read the data we just wrote. The flip() method is therefore
            an important part of using buffers in Java NIO.
         */
        //buffer.flip();

        // Read data from the buffer
        while (buffer.hasRemaining()) {
            System.out.print((char) buffer.get());
        }
    }
}
