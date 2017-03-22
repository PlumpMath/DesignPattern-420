package DecoratorPattern;

/**
 * Created by boiler-yao on 2016/7/27.
 * Basic beverage content
 */
public abstract class Beverage {
    String description = "Abstract Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}
