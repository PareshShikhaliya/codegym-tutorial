package fileprogram;
/*
In this example, we first create an instance of FileInputStream to read data from the file "file.txt".
 We then use a buffer of size 1024 bytes to read data from the input stream.
  We use a while loop to keAep reading until the end of the stream is reached.

In each iteration of the loop, we read data from the input stream into the buffer using the read method of the InputStream class
The read method returns the number of bytes read, which we store in the bytesRead variable.
 We then convert the data in the buffer to a String object and print it to the console using System.out.print.

We use a try-with-resources block to ensure that the InputStream is closed properly after reading the data.
 Any IOException that occurs is caught and printed to the console using the printStackTrace method.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) {



        try (InputStream inputStream = new FileInputStream("C:\\Users\\pares\\IdeaProjects\\Collections\\src\\fileprogram\\file.txt")) {
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                String data = new String(buffer, 0, bytesRead);
                System.out.print(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
