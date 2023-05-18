import Observable.IphoneObservable;
import Observable.StockObservable;
import Observer.EmailNotificationAlert;
import Observer.NotificationAlertObserver;
import Observer.SMSNotificationAlert;
package.
public class Store {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservable();

        NotificationAlertObserver user1 = new EmailNotificationAlert("xyz@gmail.com",iphoneObservable);
        NotificationAlertObserver user2 = new EmailNotificationAlert("xyz@gmail.com",iphoneObservable);
        NotificationAlertObserver user3 = new SMSNotificationAlert("9810643331",iphoneObservable);

        iphoneObservable.add(user1);
        iphoneObservable.add(user2);
        iphoneObservable.add(user3);

        iphoneObservable.setStock(0);

    }
}
