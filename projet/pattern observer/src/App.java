import observable.Observable;
import observable.ObservableImpl;
import observers.Observer;
import observers.ObserverImpl1;
import observers.ObserverImpl2;

public class App {
    public static void main(String[] args) {
        ObservableImpl observable= new ObservableImpl();
        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();

        observable.subscribe(observer1);
        observable.subscribe(observer2);

       observable.setEtat(90);
       observable.setEtat(60);

        System.out.println("********************");
       observable.unsubscribe(observer2);

       observable.setEtat(33);

       observable.subscribe(new Observer() {
           @Override
           public void update(Observable observable) {
               int etat = ((ObservableImpl)observable).getEtat();
               System.out.println("observateur anonyme 1 => "+etat);
           }
       });



        // avec java8 on peut utiliser fonction lambda
        observable.subscribe((obs)->{
            int etat = ((ObservableImpl)obs).getEtat();
            System.out.println("observateur anonyme 2 => "+etat);
        });

        observable.setEtat(44);
    }
}
