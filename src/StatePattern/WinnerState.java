package StatePattern;

/**
 * Created by boileryao on 2017/3/22.
 * State: Winner State
 */
public class WinnerState extends HasCoinState{
    WinnerState(GumballMachine machine) {
        super(machine);
    }

    @Override
    public void turnCrank() {
        if (mMachine.count > 1) {
            System.out.println("你中奖了，你得到了两个棒棒糖！");
            super.turnCrank();
        }
        super.turnCrank();
    }
}
