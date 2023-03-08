package nioexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\pares\\IdeaProjects\\NewWS\\src\\nioexample\\PathExample.java");
        System.out.println("File name: " + path.getFileName());
        System.out.println("Parent directory: " + path.getParent());
        System.out.println("Absolute path: " + path.toAbsolutePath());
        System.out.println("Is readable: " + Files.isReadable(path));
        System.out.println("Is writable: " + Files.isWritable(path));
        System.out.println("Is executable: " + Files.isExecutable(path));
        boolean exists = Files.exists(path);
        System.out.println("exists: " + exists);
        if(exists) {
            String content = Files.readString(path);
            System.out.println(content);
        }

    }
}

