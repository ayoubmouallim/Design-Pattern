import Strategy.IStrategy;

public class Context {
    private IStrategy strategy ;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void appliquerStrategy(){

        strategy.appliquer();
    }
}
