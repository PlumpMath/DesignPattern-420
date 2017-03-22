package StrategyPattern;

/**
 * Created by boiler-yao on 2016/7/24.
 */
public class RiverDuck extends Duck {
    public RiverDuck(String name, String region, int age) {
        super(name, region, age);
        flyBehavior = new FlyWithWings();
    }
}
