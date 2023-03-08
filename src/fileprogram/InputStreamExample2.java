package fileprogram;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample2 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
           /* input = new FileInputStream("C:\\Users\\pares\\IdeaProjects\\Collections\\src\\fileprogram\\file.txt");
            int data = input.read();
            while (data != -1) {
                System.out.print(data);
                data = input.read();
            }*/

            inputStream = new FileInputStream("C:\\Users\\pares\\IdeaProjects\\Collections\\src\\fileprogram\\file.txt");
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                String data = new String(buffer, 0, bytesRead);
                System.out.println(data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
