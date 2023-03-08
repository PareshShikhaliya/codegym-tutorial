package nioexample;
/*
In Java NIO,
a Channel is a conduit for data between a Buffer and an entity such as a file
 or a network socket. Channels are part of the java.nio.channels package, and they provide a higher-level, more flexible API for I/O operations compared to streams in Java IO.
 */
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ChannelExample {

    public static void main(String[] args) {
        // Create a path to the file
        Path filePath = Paths.get("C:\\Users\\pares\\IdeaProjects\\NewWS\\src\\nioexample\\DIFF.TXT");

        try (FileChannel channel = FileChannel.open(filePath, StandardOpenOption.READ)) {
            // Create a buffer to hold the data
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            // Read data from the channel into the buffer
            int bytesRead = channel.read(buffer);
            while (bytesRead != -1) {
                // Flip the buffer to prepare for reading
                buffer.flip();



                // Print the data in the buffer
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }

                // Clear the buffer to prepare for writing
                buffer.clear();

                // Read more data from the channel into the buffer
                bytesRead = channel.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

