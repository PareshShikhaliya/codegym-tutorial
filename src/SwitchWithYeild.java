public class SwitchWithYeild {
    public static void main(String[] args) {
       int result = getValueViaYield("a");
        System.out.println("The result is =="+result);
    }
    private static int getValueViaYield(String mode) {
        int result = switch (mode) {
            case "a", "b":
                yield 1;
            case "c":
                yield 2;
            case "d", "e", "f":
                // do something here...
                System.out.println("Supports multi line block!");
                yield 3;
            default:
                yield -1;
        };
        return result;
    }
}