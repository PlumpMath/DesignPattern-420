package StatePattern;


/**
 * Created by boileryao on 2017/3/22.
 * the gumball auto retailer
 */
public class GumballMachine {
    int count = 0;

    State state;
    State noCoinState = new NoCoinState(this);
    State hasCoinState = new HasCoinState(this);
    State soldOutState = new SoldOutState(this);
    State winnerState = new WinnerState(this);

    GumballMachine(int count) {
        this.count = count;
        state = noCoinState;
    }

    void insertCoin() {
        state.insertCoin();
    }

    void ejectCoin() {
        state.ejectCoin();
    }

    void turnCrank() {
        state.turnCrank();
    }

    void setState(State to) {
        state = to;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s%d%s.", "Boiler Inc.", "There're ", count, " gumballs available");
    }
}
