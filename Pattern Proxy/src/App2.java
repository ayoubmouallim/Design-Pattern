import proxy.CacheProxy;
import stand.IStandar;

public class App {
    public static void main(String[] args) {
        IStandar standar =new CacheProxy();

        standar.compute(2);
        standar.compute(2);


    }
}
