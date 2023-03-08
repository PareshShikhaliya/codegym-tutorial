package fileprogram.class2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FileExample {
    public static void main(String args[]) throws FileNotFoundException {


        //createFile();

       // writingFile();
      //  readingFile();
        //deleteFile();

        //createDir();

        deleteDir();


    }

    private static void deleteDir() {
        File dir = new File("createDir");
        if (dir.delete()) {
            System.out.println("Directory deleted successfully.");
        } else {
            System.out.println("An error occurred while deleting the directory.");
        }
    }

    private static void createDir() {
        File dir = new File("createDir");
        if (dir.mkdir()) {
            System.out.println("Directory created successfully.");
        } else {
            System.out.println("An error occurred while creating the directory.");
        }
    }

    private static void deleteFile() {
        File file = new File("createFile.txt");
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("An error occurred while deleting the file.");
        }
    }

    private static void readingFile() throws FileNotFoundException {
        File file = new File("createFile.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found.");
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }


    private static void writingFile() {
        FileWriter writer = null;
        try {
            writer = new FileWriter("createFile.txt");
            writer.write("1111add more texts.");// how to append
            System.out.println("Text written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the file.");
                    e.printStackTrace();
                }
            }
        }
    }

    private static void createFile() {
        File file = new File("createFile.txt");
        try {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
