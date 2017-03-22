package StrategyPattern;

/**
 * Created by boiler-yao on 2016/7/24.
 */
public class FlyNothing implements FlyBehavior {
    @Override
    public void performFly() {
        System.out.println("Damn it! I CAN'T fly.");
    }
}
