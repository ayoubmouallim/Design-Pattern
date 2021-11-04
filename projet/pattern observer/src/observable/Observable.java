package observable;

import observers.Observer;

public interface Observable {

     void subscribe(Observer observer); // add observer
     void unsubscribe(Observer observer);// remove observer
     void notifyObservers( );

}
