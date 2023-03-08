package decorator;

public class HazelnutCoffee extends CoffeeDecorator {
    public HazelnutCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with hazelnut";
    }
}
