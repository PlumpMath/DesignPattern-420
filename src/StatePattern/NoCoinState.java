package StatePattern;

/**
 * Created by boileryao on 2017/3/22.
 * State: No Coin
 */
public class NoCoinState extends State {
    NoCoinState(GumballMachine machine) {
        this.mMachine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("你成功投入了一个硬币！");
        if (Math.random() > 0.6) {
            switchTo(mMachine.winnerState);
        } else {
            switchTo(mMachine.hasCoinState);
        }
    }

    @Override
    public void ejectCoin() {
        System.out.println("还没投币，退个毛线啊！");
    }

    @Override
    public void turnCrank() {
        System.out.println("先投币给能给你棒棒糖哦！");
    }

}
