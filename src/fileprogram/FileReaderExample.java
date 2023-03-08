package fileprogram;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\Users\\pares\\IdeaProjects\\Collections\\src\\fileprogram\\file.txt")) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

