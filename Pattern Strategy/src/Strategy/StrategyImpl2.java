package Strategy;

import Strategy.IStrategy;

public class StrategyImpl2 implements IStrategy {
    @Override
    public void appliquer() {
        System.out.println("j'applique la strategie 2");
    }
}
