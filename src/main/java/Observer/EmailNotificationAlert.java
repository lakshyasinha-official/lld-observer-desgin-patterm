package Observer;

import Observable.StockObservable;

public class EmailNotificationAlert implements NotificationAlertObserver{

    public String  email;

    public StockObservable stockObservable;

    public EmailNotificationAlert(String email, StockObservable stockObservable){
        this.email = email;
        this.stockObservable=stockObservable;
    }
    @Override
    public void update() {
        System.out.println("Sending email");
    }
}
