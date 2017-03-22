package StatePattern;

/**
 * Created by boileryao on 2017/3/22.
 * the abstract state
 */
public abstract class State {
    GumballMachine mMachine;
    public abstract void insertCoin();
    public abstract void ejectCoin();
    public abstract void turnCrank();
    public void switchTo(State state) {
        mMachine.setState(state);
    }
}
