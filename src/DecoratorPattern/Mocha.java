package DecoratorPattern;

/**
 * Created by boiler-yao on 2016/7/27.
 * Mocha
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Mocha";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.13;
    }
}
