package DecoratorPattern;

/**
 * Created by boiler-yao on 2016/7/27.
 * Whip
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Whip";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.21;
    }
}
