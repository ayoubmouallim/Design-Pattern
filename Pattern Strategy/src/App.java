import Strategy.IStrategy;
import Strategy.StrategyImpl1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
         Context context =new Context();
        context.setStrategy(new StrategyImpl1());
        context.appliquerStrategy();

        
    }
}
