package observers;

import observable.Observable;
import observable.ObservableImpl;

public class ObserverImpl2 implements  Observer{
    private double lastState;

    @Override
    /*
    public void update(int etat) {
        if(etat-lastState >0)
        System.out.println("Observateur 2 => augmentation de la pression ");
        else if(etat-lastState < 0)
            System.out.println("Observateur 2 => depression ");
        else System.out.println("Observateur 2 => stabilité ");

        lastState = etat;
    }
*/
    public void update(Observable observable) {
        int etat=((ObservableImpl)observable).getEtat();
        if(etat-lastState >0)
            System.out.println("Observateur 2 => augmentation de la pression ");
        else if(etat-lastState < 0)
            System.out.println("Observateur 2 => depression ");
        else System.out.println("Observateur 2 => stabilité ");

        lastState = etat;
    }
}
