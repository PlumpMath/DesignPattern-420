package StrategyPattern;

/**
 * Created by boiler-yao on 2016/7/24.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void performFly() {
        System.out.println("I am flying with my WINGS. orz");
    }
}
