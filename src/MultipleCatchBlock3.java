/*
case when your are catching multiple exceptions, follow the rule of generalized to more specialized. It means that, if you are using super (general) class, don't use child (specialized) class
 */
public class MultipleCatchBlock3 {

    public static void main(String[] args) {

        try{
            int array[] = new  int[10];
            array[10] = 30/10;
        }
        catch(  ArithmeticException e)
        {

        }
        catch(  ArrayIndexOutOfBoundsException  e)
        {

        }

        System.out.println("rest of the code");
    }
}