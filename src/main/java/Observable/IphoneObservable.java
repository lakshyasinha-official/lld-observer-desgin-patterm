package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{
    
    public int stock = 0 ;
    List<NotificationAlertObserver> observableList = new ArrayList<>();
    

    @Override
    public void add(NotificationAlertObserver o) {
        observableList.add(o);
    }

    @Override
    public void remove(NotificationAlertObserver o) {
        observableList.remove(o);

    }

    @Override
    public void notifyUser() {
        for (NotificationAlertObserver observer:
                observableList
             ) {
            observer.update();
        }

    }

    public void setStock(int stock) {
        if(stock==0)
            notifyUser();
        this.stock = stock+ this.stock;
    }
}
