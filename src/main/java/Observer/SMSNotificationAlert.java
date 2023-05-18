package Observer;

import Observable.StockObservable;

public class SMSNotificationAlert implements NotificationAlertObserver{

    public String mobileNo;

    public StockObservable stockObservable;

    public SMSNotificationAlert(String mobileNo, StockObservable stockObservable){
        this.mobileNo = mobileNo;
        this.stockObservable=stockObservable;
    }
    @Override
    public void update() {
        System.out.println("Sending SMS");
    }
}
