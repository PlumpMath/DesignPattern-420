package DecoratorPattern;

/**
 * Created by boiler-yao on 2016/7/27.
 * espresso
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso Coffee";
    }

    @Override
    public double getCost() {
        return 233;
    }
}
