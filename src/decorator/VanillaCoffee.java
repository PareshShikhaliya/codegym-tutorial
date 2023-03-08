package decorator;

public class VanillaCoffee extends CoffeeDecorator {
    public VanillaCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with vanilla";
    }
}
