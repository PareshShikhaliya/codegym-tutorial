package fileprogram;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/*
 BufferedInputStream to improve performance when reading from a file.
  This is because BufferedInputStream reads data from the file in larger chunks and stores it in an internal buffer,
  reducing the number of times the file needs to be accessed.

  In this example, we wrap the FileInputStream instance with a BufferedInputStream instance.
  This improves the performance of reading data from the file, since the BufferedInputStream reads data from the file in larger chunks
   and stores it in an internal buffer, reducing the number of times the file needs to be accessed.
   The rest of the code is the same as the previous example.
 */
public class BufferedInputStreamExample {
    public static void main(String[] args) {
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\pares\\IdeaProjects\\Collections\\src\\fileprogram\\file.txt"))) {
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

