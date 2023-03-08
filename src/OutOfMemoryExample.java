import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        try {
            while (true) {
                list.add(1);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("the size of the list ="+list.size());
            System.err.println("Out of memory occurred");
        }
        finally {
            System.err.println("finally");
        }
    }
}
