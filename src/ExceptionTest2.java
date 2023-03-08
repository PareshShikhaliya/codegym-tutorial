public class ExceptionTest2 {
    public static void main(String[] args) {

        System.out.println("inside main -> "+m());
    }

    static String m(){
        try{
            int i=10/0; //will throw ArithmeticException
        }catch(ArithmeticException e){

            return "catch";
        }
        finally {
            System.out.println("method finally -");
        }
        return "last";
    }
}