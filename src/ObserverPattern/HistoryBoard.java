package ObserverPattern;

/**
 * Created by boiler-yao on 2016/8/2.
 */
public class HistoryBoard implements Observer {
    @Override
    public void onChange(Weather weather) {
        System.out.println("-------------- History Board -------------");
        System.out.println(weather.description + " @" + weather.temprature);
    }
}
