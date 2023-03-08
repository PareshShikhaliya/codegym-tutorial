package fileprogram;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
In this example, we create a new BufferedInputStream that wraps around a FileInputStream for the file
 "file.txt". We then read data from the input stream one byte at a time using the read() method,
  which returns -1 when the end of the stream is reached.
   The BufferedInputStream reads a chunk of bytes from the underlying FileInputStream
   and buffers them internally, which can improve performance when reading from a file.

Note that we use a try-with-resources statement to automatically close the

input stream when we're done with it. This is important to ensure
that system resources are released and to avoid memory leaks.
 */

public class BufferedInputStreamExample2 {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\pares\\IdeaProjects\\Collections\\src\\fileprogram\\file.txt"),1024)) {
            int data;
            while ((data = bis.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

