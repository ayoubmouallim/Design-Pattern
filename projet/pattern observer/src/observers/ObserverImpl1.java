package observers;

import observable.Observable;
import observable.ObservableImpl;

public class ObserverImpl1 implements Observer{

    private double somme;

    @Override
    /*
    public void update(int etat) {
        somme+=etat;
        System.out.println("Observateur 1 somme="+somme);
    }

     */
    public void update(Observable observable) {
        somme+=((ObservableImpl)observable).getEtat();
        System.out.println("Observateur 1 somme="+somme);
    }
}
