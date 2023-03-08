public class ExceptionTest4 {
    public static void main(String[] args) {
        try {
           // Class.forName("com.example.MyClass");
            Class.forName("DriverClass");
            System.out.println("class found");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }
}