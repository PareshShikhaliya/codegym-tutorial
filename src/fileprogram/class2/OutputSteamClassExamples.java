package fileprogram.class2;

import java.io.*;

/*
In Java, the OutputStream and Writer classes are used for writing data to an output stream.
 Here are some commonly used subclasses of OutputStream:

FileOutputStream: used for writing binary data to a file.
BufferedOutputStream: used for buffering data written to an output stream, which can improve performance.
DataOutputStream: used for writing binary data types, such as int, double, and boolean, to an output stream.
PrintStream: used for writing formatted data to an output stream.
Here are some commonly used subclasses of Writer:

FileWriter: used for writing character data to a file.
BufferedWriter: used for buffering data written to a writer, which can improve performance.
PrintWriter: used for writing formatted data to a writer.
 */
public class OutputSteamClassExamples {
    public static void main(String args[])
    {
        System.out.println("Hi");

        //fileOutputStreamExample();

       // bufferOutputStreamExample();
//
      // dataOutputStream();
//
        //printStream();
//
//
       //fileWriterExample();
//
//
        //fileReaderExample();
//
 bufferWriterExample();
//
//        printWriterExample();
    }

    private static void printWriterExample() {
        try {
            String name = "John";
            int age = 30;
            double height = 1.75;
            PrintWriter pw = new PrintWriter(new FileWriter("printWriterExample.txt"));
            pw.printf("Name: %s%n", name);
            pw.printf("Age: %d%n", age);
            pw.printf("Height: %.2f%n", height);
            pw.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    private static void bufferWriterExample() {
        try {
            String text = "Hello, world!";
            FileWriter fw = new FileWriter("output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            bw.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    private static void fileReaderExample() {
        try {
            FileReader reader = new FileReader("fileWriterExample.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }

    private static void fileWriterExample() {
        try {
            String text = "Hello, world!";
            FileWriter writer = new FileWriter("fileWriterExample.txt");
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    private static void printStream() {
        try {
            String text = "Hello, world!\n";
            FileOutputStream fos = new FileOutputStream("output.txt");
            PrintStream ps = new PrintStream(fos);
            ps.printf("The text is: %s", text);
            ps.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    private static void dataOutputStream() {
        try {
            FileOutputStream fos = new FileOutputStream("dataOutputStream.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            int intValue = 42;
            double doubleValue = 3.14;
            boolean booleanValue = true;
            dos.writeInt(intValue);
            dos.writeDouble(doubleValue);
            dos.writeBoolean(booleanValue);
            dos.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    private static void bufferOutputStreamExample() {
        try {
            byte[] data = { 0x42, 0x41, 0x44, 0x20, 0x44, 0x41, 0x54, 0x41 }; // "BAD DATA" in ASCII
            FileOutputStream fos = new FileOutputStream("bufferOutputStreamExample.bin");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(data);
            bos.flush();
            bos.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    private static void fileOutputStreamExample() {
        try {
            FileOutputStream fos = new FileOutputStream("fileOutputStreamExample.bin");
            fos.write(320);
            fos.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
