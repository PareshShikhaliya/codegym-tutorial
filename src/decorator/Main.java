package decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new VanillaCoffee(coffee);
        coffee = new HazelnutCoffee(coffee);
        System.out.println(coffee.getDescription() + ": $" + coffee.getCost());
    }
}