package StatePattern;

/**
 * Created by boileryao on 2017/3/22.
 * State: Sold Out
 */
public class SoldOutState extends State{
    SoldOutState(GumballMachine machine) {
        mMachine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("卖光了！");
        ejectCoin();
    }

    @Override
    public void ejectCoin() {
        System.out.println("没有存货，已自动退币。");
    }

    @Override
    public void turnCrank() {
        System.out.println("卖光了！");
    }

}
