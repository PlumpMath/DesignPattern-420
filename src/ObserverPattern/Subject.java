package ObserverPattern;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by boiler-yao on 2016/7/26.
 * Subject interface
 */
public interface Subject {
    List<Observer> observers = new LinkedList<>();
    abstract void addObserver(Observer o);
    abstract void removeObserver(Observer o);
    abstract void notifyChange();
}
