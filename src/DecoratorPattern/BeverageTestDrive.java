package DecoratorPattern;

/**
 * Created by boiler-yao on 2016/7/27.
 * Test of Decorator Pattern
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " - $" + beverage.getCost());

        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " - $" + beverage1.getCost());
    }
}
