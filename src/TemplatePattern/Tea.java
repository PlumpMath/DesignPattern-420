package TemplatePattern;

/**
 * Created by boileryao on 2017/3/22.
 * Tea Beverage
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Adding Tea and keep heating...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon juice...");
    }

    @Override
    void custom() {
        System.out.println("Adding another lemon juice...");
    }
}
