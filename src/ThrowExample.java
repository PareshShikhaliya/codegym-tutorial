import java.io.IOException;

public class ThrowExample {
    //defining a method
    public static void findSquare(int num) throws IOException,ArithmeticException {

    }

    //main method
    public static void main(String[] args) {
        ThrowExample obj = new ThrowExample();
        try {
            obj.findSquare(-3);
        } catch (IOException e) {
            System.out.println("Exception raised");
        }
        System.out.println("Rest of the code..");
    }
}