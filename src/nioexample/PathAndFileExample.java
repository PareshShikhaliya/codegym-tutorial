package nioexample;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFileExample {

    public static void main(String[] args) throws IOException {
        // Create a Path object for the file we want to work with
        Path path = Paths.get("C:\\Users\\pares\\IdeaProjects\\NewWS\\src\\nioexample\\DIFF.TXT");

        // Print out the file name
        String filename = path.getFileName().toString();
        System.out.println("Filename: " + filename);

        // Print out the parent directory
        Path parentDir = path.getParent();
        System.out.println("Parent directory: " + parentDir);

        // Check if the file exists
        boolean exists = Files.exists(path);
        System.out.println("File exists: " + exists);

        // Read the contents of the file and print them out
        String content = Files.readString(path);
        System.out.println("File content: " + content);

        // Write to the file
        String newContent = "Hello, world!";
        Files.writeString(path, newContent);

        // Check if the file is a directory
        boolean isDir = Files.isDirectory(path);
        System.out.println("Is directory: " + isDir);

        // List the contents of the parent directory
        DirectoryStream<Path> stream = Files.newDirectoryStream(parentDir);
        System.out.println("Contents of parent directory:");
        for (Path p : stream) {
            System.out.println(p.toString());
        }

        // Create a new directory
        Path newDir = Paths.get("C:\\Users\\pares\\IdeaProjects\\NewWS\\src\\nioexample\\TEST1");
        Files.createDirectory(newDir);

         //Copy the file to a new location
        Path dest = Paths.get("/path/to/destination/file.txt");
        Files.copy(path, dest);

        //Move the file to a new location
        Files.move(path, newDir.resolve(filename));
    }
}
