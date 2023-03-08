import java.io.IOException;

public class ExceptionTest3 {

    void display(Exception e){

        System.out.println(e+" caught in Exception method");
    }


    public static void main(String[] args) {
        ExceptionTest3 obj=new ExceptionTest3();
        obj.display(new ArithmeticException());

    }
}