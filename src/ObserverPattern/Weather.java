package ObserverPattern;

/**
 * Created by boiler-yao on 2016/7/26.
 * weather bean
 */
public class Weather implements Subject {
    String description = "";
    double temprature;

    void setValue(String description, double temprature) {
        this.description = description;
        this.temprature = temprature;
        notifyChange();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyChange() {
        for (Observer o: observers) {
            o.onChange(this);
        }
    }
}
