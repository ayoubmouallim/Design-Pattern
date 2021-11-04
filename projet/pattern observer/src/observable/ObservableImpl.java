package observable;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{

    private int etat;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
            observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
           for (Observer o:observers)
           {
               // technique push
              // o.update(etat);
              // technique pop
               o.update(this);
           }
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
        this.notifyObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
}
