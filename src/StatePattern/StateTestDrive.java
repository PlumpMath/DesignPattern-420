package StatePattern;

/**
 * Created by boileryao on 2017/3/22.
 * Test drive for state pattern
 * State Pattern :: switch current state to behave differently
 */
public class StateTestDrive {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(23);

        System.out.println(machine);
        machine.insertCoin();
        machine.ejectCoin();
        machine.turnCrank();
        System.out.println();

        System.out.println(machine);
        machine.insertCoin();
        machine.turnCrank();
        machine.insertCoin();
        machine.turnCrank();
        machine.insertCoin();
        machine.turnCrank();
        machine.insertCoin();
        machine.turnCrank();
        machine.insertCoin();
        machine.turnCrank();
        machine.insertCoin();
        machine.turnCrank();
        machine.turnCrank();
        System.out.println();

    }
}
