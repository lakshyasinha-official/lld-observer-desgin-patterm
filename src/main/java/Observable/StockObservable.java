package Observable;

import Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver o);

    public void remove(NotificationAlertObserver o);

    public void notifyUser();

    void setStock(int i);
}
