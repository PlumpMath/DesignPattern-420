package StatePattern;

/**
 * Created by boileryao on 2017/3/22.
 * State: Coin Inserted
 */
public class HasCoinState extends State {
    HasCoinState(GumballMachine machine) {
        mMachine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("你已经投过硬币了，小傻瓜！");
    }

    @Override
    public void ejectCoin() {
        System.out.println("退币成功！");
        switchTo(mMachine.noCoinState);
    }

    @Override
    public void turnCrank() {
        System.out.println("你的棒棒糖已经放到下面的盒子啦！");
        mMachine.count = mMachine.count - 1;
        if (mMachine.count > 0)
            switchTo(mMachine.noCoinState);
        else
            switchTo(mMachine.soldOutState);
    }

}
