package nioexample;

import java.nio.file.*;

public class FileExample {
    public static void main(String[] args) {
        // Create a Path object for the file we want to read
        Path path = Paths.get("PrintWriterExample.txt");

        // Check if the file exists
        if (!Files.exists(path)) {
            System.out.println("File does not exist");
            return;
        }

        // Read the contents of the file
        try {
            String content = Files.readString(path);
            System.out.println("File contents:");
            System.out.println(content);
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Write some new content to the file
        try {
            String newContent = "This is some new content";
            Files.writeString(path, newContent, StandardOpenOption.APPEND);
            System.out.println("New content written to file");
        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

        // Read the contents of the file again to verify the new content was added
        try {
            String content = Files.readString(path);
            System.out.println("File contents after writing new content:");
            System.out.println(content);
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }
    }
}

