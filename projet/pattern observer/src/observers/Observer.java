package observers;

import observable.Observable;

public interface Observer {
    //public void update(int etat);
    public void update(Observable observable);
}
