package ObserverPattern;

import java.util.Scanner;

/**
 * Created by boiler-yao on 2016/7/26.
 * ObserverPattern Text
 */
public class ObserverTestDrive {
    public static void main(String[] args) {
        Weather weather = new Weather();
        Scanner in = new Scanner(System.in);

        weather.addObserver(new CurrentBoard());
        weather.addObserver(new HistoryBoard());

        for (int i = 0; i < 5; i++) {
            weather.setValue(in.next(), in.nextDouble());
        }
    }
}
