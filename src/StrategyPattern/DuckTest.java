package StrategyPattern;

/**
 * Created by boiler-yao on 2016/7/24.
 */
public class DuckTest {
    public static void main(String[] args) {
        Duck 好吃的鸭子 = new RiverDuck("Pokemon", "Peking", 4);
        好吃的鸭子.fly();
    }
}
