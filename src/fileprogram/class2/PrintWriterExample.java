package fileprogram.class2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) {
        File file = new File("PrintWriterExample.txt");
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.println("Hello");
            writer.println("World");
            writer.printf("The value of pi is approximately %.2f", Math.PI);
            writer.close();
            System.out.println("Data written to file successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found.");
            e.printStackTrace();
        }
    }
}
