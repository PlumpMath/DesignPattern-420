package TemplatePattern;

/**
 * Created by boileryao on 2017/3/22.
 * Coffee Beverage, one of caffeine beverage
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Adding coffee with water and mix up...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Cream...");
    }
}
