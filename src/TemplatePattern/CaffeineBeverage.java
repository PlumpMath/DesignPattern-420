package TemplatePattern;

/**
 * Created by boileryao on 2017/3/22.
 * CaffeineBeverage, one of the caffeine beverage
 */
public abstract class CaffeineBeverage {
    final void make() {
        boilWater();
        brew();
        pour();
        addCondiments();
        custom();
    }

    void boilWater() {
        System.out.println("Boiling water...");
    }

    abstract void brew();

    void pour() {
        System.out.println("Pouring this into a cup...");
    }

    abstract void addCondiments();

    /**
     * hook
     */
    void custom() {
        //empty, this is a hook of the making procedure
    }
}
