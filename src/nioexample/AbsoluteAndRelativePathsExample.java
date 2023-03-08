package nioexample;

import java.nio.file.Path;
import java.nio.file.Paths;

public class AbsoluteAndRelativePathsExample {

    public static void main(String[] args) {
        // Create a path using an absolute path
        Path absolutePath = Paths.get("C:\\Users\\pares\\IdeaProjects\\NewWS\\src\\nioexample\\DIFF.TXT");
        System.out.println("Absolute path: " + absolutePath);

        // Create a path using a relative path
        Path relativePath = Paths.get("src\\nioexample\\DIFF.TXT");
        System.out.println("Relative path: " + relativePath);

        // Get the absolute path of the relative path
        Path resolvedPath = relativePath.toAbsolutePath();
        System.out.println("Resolved path: " + resolvedPath);

        // Check if the paths are equal
        boolean isEqual = absolutePath.equals(resolvedPath);
        System.out.println("Paths are equal: " + isEqual);
    }
}
