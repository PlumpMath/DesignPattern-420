package StrategyPattern;

/**
 * Created by boiler-yao on 2016/7/24.
 * An abstract class for DUCK
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    String region, name;
    int age;

    public Duck(String name, String region, int age) {
        this.name = name;
        this.region = region;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, age: %d, region %s", name, age, region.toUpperCase());
    }

    public void fly() {
        flyBehavior.performFly();
    }
}
