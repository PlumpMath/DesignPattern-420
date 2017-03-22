package ObserverPattern;

/**
 * Created by boiler-yao on 2016/8/2.
 *
 */
public class CurrentBoard implements Observer {
    @Override
    public void onChange(Weather weather) {
        System.out.println("-------------- Current Board -------------");
        System.out.println(weather.description + " @" + weather.temprature);
    }
}
