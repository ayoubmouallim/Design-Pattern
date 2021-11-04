package proxy;

import stand.IStandar;
import stand.StandarImpl;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements IStandar {
    private StandarImpl standar;
    private Map<Double,Double> cache = new HashMap<>();

    @Override
    public double compute(double x) {
        Double result = cache.get(x);
        if(result!= null)
        {
            System.out.println("********** From Cache ************");
            System.out.println("Result : "+result);
            return result;
        }
        System.out.println("********** From Source ************");
        standar = new StandarImpl();
        result = standar.compute(x);
        cache.put(x,result);
        return result;
    }

    public void setStandar(StandarImpl standar) {
        this.standar = standar;
    }
}
